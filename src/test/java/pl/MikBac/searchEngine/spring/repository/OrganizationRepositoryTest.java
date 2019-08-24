package pl.MikBac.searchEngine.spring.repository;

import org.junit.Before;
import org.junit.Test;
import pl.MikBac.searchEngine.spring.repository.impl.OrganizationRepositoryImpl;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by MikBac on 2019
 */

public class OrganizationRepositoryTest {

    private OrganizationRepository organizationRepository;

    @Before
    public void init() {
        organizationRepository = new OrganizationRepositoryImpl();
    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsAllegro() {
        Integer pagesNumber;
        pagesNumber = organizationRepository.getRepositoriesQuantity("Allegro");
        assertNotNull(pagesNumber);
    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsALLEGRO() {
        Integer pagesNumber;
        pagesNumber = organizationRepository.getRepositoriesQuantity("ALLEGRO");
        assertNotNull(pagesNumber);
    }
}
