package pl.mikbac.search_engine.model;

import org.junit.Test;
import pl.mikbac.search_engine.model.exte.OrganizationModel;

import static org.junit.Assert.assertEquals;

/**
 * Created by MikBac on 2019
 */

public class OrganizationModelTest {

    @Test
    public void set_name_and_get_name_one() {
        OrganizationModel organization = new OrganizationModel();
        String name = "Allegro";
        organization.setLogin(name);
        assertEquals(name, organization.getLogin());
    }

    @Test
    public void set_name_and_get_name_two() {
        OrganizationModel organization = new OrganizationModel();
        String name = "123";
        organization.setLogin(name);
        assertEquals(name, organization.getLogin());
    }

    @Test
    public void set_number_of_repositories_and_get_name_one() {
        OrganizationModel organization = new OrganizationModel();
        Integer numberOfRepositories = 1999;
        organization.setPublicRepos(numberOfRepositories);
        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }

    @Test
    public void set_number_of_repositories_and_get_name_two() {
        OrganizationModel organization = new OrganizationModel();
        Integer numberOfRepositories = 1;
        organization.setPublicRepos(numberOfRepositories);
        assertEquals(numberOfRepositories, organization.getPublicRepos());
    }
}
