/**
 * Created by MikBac on 2019
 */

package com.spring.repository;

import org.junit.Before;
import org.junit.Test;
import pl.MikBac.searchEngine.spring.repository.OrganizationRepository;

import static junit.framework.TestCase.assertNotNull;

public class OrganizationRepositoryTest {

    private OrganizationRepository organizationRepository;

    @Before
    public void init() {
        organizationRepository = new OrganizationRepository();
    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsAllegro() {

        int pagesNumber;
        pagesNumber = organizationRepository.readNumberOfRepositories("Allegro");

        assertNotNull(pagesNumber);

    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsALLEGRO() {

        int pagesNumber;
        pagesNumber = organizationRepository.readNumberOfRepositories("ALLEGRO");

        assertNotNull(pagesNumber);

    }
}
