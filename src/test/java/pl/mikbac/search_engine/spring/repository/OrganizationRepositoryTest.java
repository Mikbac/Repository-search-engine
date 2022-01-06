package pl.mikbac.search_engine.spring.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mikbac.search_engine.spring.property.GithubProperties;
import pl.mikbac.search_engine.spring.repository.impl.OrganizationRepositoryImpl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
public class OrganizationRepositoryTest {

    @InjectMocks
    private final OrganizationRepository organizationRepository = new OrganizationRepositoryImpl();

    @Mock
    private GithubProperties githubProperties;

    @Before
    public void init() {
        when(githubProperties.getUrl()).thenReturn("https://api.github.com/orgs/");
    }

    @Test
    public void read_number_of_repositories_when_organization_name_is_Allegro() {
        int pagesNumber;
        pagesNumber = organizationRepository.getRepositoriesQuantity("Allegro");
        assertTrue(pagesNumber != 0);
    }

    @Test
    public void read_number_of_repositories_when_organization_name_is_ALLEGRO() {
        int pagesNumber;
        pagesNumber = organizationRepository.getRepositoriesQuantity("ALLEGRO");
        assertTrue(pagesNumber != 0);
    }
}
