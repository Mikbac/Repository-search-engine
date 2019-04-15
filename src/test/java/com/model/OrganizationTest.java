package com.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganizationTest {

    @Test
    public void setNameAndGetName1(){
        Organization organization = new Organization();
        String name = "Allegro";

        organization.setName(name);

        assertEquals(name, organization.getName());
    }

    @Test
    public void setNameAndGetName2(){
        Organization organization = new Organization();
        String name = "123";

        organization.setName(name);

        assertEquals(name, organization.getName());
    }

    @Test
    public void setNumberOfRepositoriesAndGetName1(){
        Organization organization = new Organization();
        int numberOfRepositories = 1999;

        organization.setNumberOfRepositories(numberOfRepositories);

        assertEquals(numberOfRepositories, organization.getNumberOfRepositories());
    }

    @Test
    public void setNumberOfRepositoriesAndGetName2(){
        Organization organization = new Organization();
        int numberOfRepositories = 1;

        organization.setNumberOfRepositories(numberOfRepositories);

        assertEquals(numberOfRepositories, organization.getNumberOfRepositories());
    }
}
