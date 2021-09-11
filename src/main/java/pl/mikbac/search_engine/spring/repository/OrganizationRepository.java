package pl.mikbac.search_engine.spring.repository;

/**
 * Created by MikBac on 24.08.2019
 */

public interface OrganizationRepository {

    /**
     * Get the quantity of repositories.
     *
     * @param organizationName organization name.
     * @return quantity of repositories.
     */
    int getRepositoriesQuantity(final String organizationName);

}
