/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganizationModelTest {

    @Test
    public void setNameAndGetName1() {
        OrganizationModel organization = new OrganizationModel();
        String name = "Allegro";

        organization.setLogin(name);

        assertEquals(name, organization.getLogin());
    }

    @Test
    public void setNameAndGetName2() {
        OrganizationModel organization = new OrganizationModel();
        String name = "123";

        organization.setLogin(name);

        assertEquals(name, organization.getLogin());
    }

    @Test
    public void setNumberOfRepositoriesAndGetName1() {
        OrganizationModel organization = new OrganizationModel();
        int numberOfRepositories = 1999;

        organization.setPublicRepos(numberOfRepositories);

        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }

    @Test
    public void setNumberOfRepositoriesAndGetName2() {
        OrganizationModel organization = new OrganizationModel();
        int numberOfRepositories = 1;

        organization.setPublicRepos(numberOfRepositories);

        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }
}
