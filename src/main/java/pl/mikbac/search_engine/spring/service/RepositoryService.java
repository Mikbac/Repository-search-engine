package pl.mikbac.search_engine.spring.service;

import pl.mikbac.search_engine.model.exte.RepositoryModel;

import java.util.List;

/**
 * Created by MikBac on 2019
 */

public interface RepositoryService {

    /**
     * Get the list of all repositories.
     *
     * @param organizationName organization name.
     * @return list of repositories {@link RepositoryModel}.
     */
    List<RepositoryModel> getAllRepositories(final String organizationName);

    /**
     * Get the last modified repository by the organization name.
     *
     * @param organizationName organization name.
     * @return last modified repository {@link RepositoryModel}.
     */
    RepositoryModel getLastUpdatedRepository(final String organizationName);

}
