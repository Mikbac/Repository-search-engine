package com.repository;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class OrganizationRepositoryTest {

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsAllegro() {

        int pagesNumber;
        pagesNumber = OrganizationRepository.readNumberOfRepositories("Allegro");

        assertNotNull(pagesNumber);

    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsALLEGRO() {

        int pagesNumber;
        pagesNumber = OrganizationRepository.readNumberOfRepositories("ALLEGRO");

        assertNotNull(pagesNumber);

    }
}
