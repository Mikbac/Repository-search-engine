package pl.MikBac.searchEngine.spring.repository;

import org.junit.Before;
import org.junit.Test;
import pl.MikBac.searchEngine.model.RepositoryModel;
import pl.MikBac.searchEngine.spring.repository.impl.RepositoryRepositoryImpl;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by MikBac on 2019
 */

public class RepositoryRepositoryTest {

    private RepositoryRepository repositoryRepository;

    @Before
    public void init() {
        repositoryRepository = new RepositoryRepositoryImpl();
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() {
        List<RepositoryModel> repositories;
        repositories = repositoryRepository.getRepositories("Allegro", 1);
        assertNotNull(repositories);
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() {
        List<RepositoryModel> repositories;
        repositories = repositoryRepository.getRepositories("allegro", 100);
        assertNotNull(repositories);
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() {
        List<RepositoryModel> repositories;
        repositories = repositoryRepository.getRepositories("ALLEGRO", 15);
        assertNotNull(repositories);
    }
}
