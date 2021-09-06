package pl.mikbac.searchengine.spring.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mikbac.searchengine.model.exte.RepositoryModel;
import pl.mikbac.searchengine.spring.property.GithubProperties;
import pl.mikbac.searchengine.spring.repository.impl.RepositoryRepositoryImpl;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
public class RepositoryRepositoryTest {

    @InjectMocks
    private final RepositoryRepository repositoryRepository = new RepositoryRepositoryImpl();

    @Mock
    private GithubProperties githubProperties;

    @Before
    public void init() {
        when(githubProperties.getUrl()).thenReturn("https://api.github.com/orgs/");
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
