package pl.MikBac.searchEngine.model;

import org.junit.Test;
import pl.MikBac.searchEngine.model.exte.OrganizationModel;

import static org.junit.Assert.assertEquals;

/**
 * Created by MikBac on 2019
 */

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
        Integer numberOfRepositories = 1999;
        organization.setPublicRepos(numberOfRepositories);
        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }

    @Test
    public void setNumberOfRepositoriesAndGetName2() {
        OrganizationModel organization = new OrganizationModel();
        Integer numberOfRepositories = 1;
        organization.setPublicRepos(numberOfRepositories);
        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }
}
