package com.dao;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class OrganizationDaoTest {

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsAllegro() {

        int pagesNumber;
        pagesNumber = OrganizationDao.readNumberOfRepositories("Allegro");

        assertNotNull(pagesNumber);

    }

    @Test
    public void readNumberOfRepositoriesWhenOrganizationNameIsALLEGRO() {

        int pagesNumber;
        pagesNumber = OrganizationDao.readNumberOfRepositories("ALLEGRO");

        assertNotNull(pagesNumber);

    }
}
