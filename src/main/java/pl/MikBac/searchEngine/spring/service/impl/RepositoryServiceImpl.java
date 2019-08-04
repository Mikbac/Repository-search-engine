/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.service.impl;

import org.springframework.stereotype.Service;
import pl.MikBac.searchEngine.model.RepositoryModel;
import pl.MikBac.searchEngine.spring.repository.OrganizationRepository;
import pl.MikBac.searchEngine.spring.repository.RepositoryRepository;
import pl.MikBac.searchEngine.spring.service.RepositoryService;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Resource
    private OrganizationRepository organizationRepository;

    @Resource
    private RepositoryRepository repositoryRepository;

    @Override
    public List<RepositoryModel> getAllRepositories(final String organizationName) {

        int pagesNumber = getNumberOfRepositories(organizationName);

        return repositoryRepository.getRepositories(organizationName, pagesNumber);
    }

    @Override
    public int getNumberOfRepositories(final String organizationName) {

        int pagesNumber = organizationRepository.readNumberOfRepositories(organizationName);

        return pagesNumber;
    }

    @Override
    public RepositoryModel getLastUpdatedRepository(final String organizationName) {

        List<RepositoryModel> repositories;
        repositories = getAllRepositories(organizationName);

        return findLatestDate(repositories);
    }

    @Override
    public RepositoryModel findLatestDate(final List<RepositoryModel> repositories) {
        LocalDateTime latestDate;
        RepositoryModel latestRepository;

        latestDate = getISODate(repositories.get(0).getLastUpdate());
        latestRepository = repositories.get(0);

        for (int i = 1; i < repositories.size(); i++) {
            if (latestDate.isBefore(getISODate(repositories.get(i).getLastUpdate()))) {
                latestDate = getISODate(repositories.get(i).getLastUpdate());
                latestRepository = repositories.get(i);
            }

        }

        return latestRepository;
    }

    @Override
    public LocalDateTime getISODate(final String dateString) {
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_INSTANT;
        Instant dateInstant = Instant.from(isoFormatter.parse(dateString));

        return LocalDateTime.ofInstant(dateInstant, ZoneId.of(ZoneOffset.UTC.getId()));
    }
}
