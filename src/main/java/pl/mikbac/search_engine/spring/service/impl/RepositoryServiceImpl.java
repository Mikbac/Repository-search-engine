package pl.mikbac.search_engine.spring.service.impl;

import org.springframework.stereotype.Service;
import pl.mikbac.search_engine.model.exte.RepositoryModel;
import pl.mikbac.search_engine.spring.repository.OrganizationRepository;
import pl.mikbac.search_engine.spring.repository.RepositoryRepository;
import pl.mikbac.search_engine.spring.service.RepositoryService;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by MikBac on 2019
 */

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Resource
    private OrganizationRepository organizationRepository;
    @Resource
    private RepositoryRepository repositoryRepository;

    @Override
    public List<RepositoryModel> getAllRepositories(final String organizationName) {
        return repositoryRepository.getRepositories(organizationName, getRepositoriesQuantity(organizationName));
    }

    @Override
    public RepositoryModel getLastUpdatedRepository(final String organizationName) {
        return getLatestDate(getAllRepositories(organizationName));
    }

    @Override
    public RepositoryModel getLatestDate(final List<RepositoryModel> repositories) {
        LocalDateTime latestDate = getISODate(repositories.get(0).getLastUpdate());
        RepositoryModel latestRepository = repositories.get(0);

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
        final DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_INSTANT;
        final Instant dateInstant = Instant.from(isoFormatter.parse(dateString));

        return LocalDateTime.ofInstant(dateInstant, ZoneId.of(ZoneOffset.UTC.getId()));
    }

    private int getRepositoriesQuantity(final String organizationName) {
        return organizationRepository.getRepositoriesQuantity(organizationName);
    }

}
