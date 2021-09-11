package pl.mikbac.search_engine.spring.facade;

import pl.mikbac.search_engine.data.impl.RepositoryData;

/**
 * Created by MikBac on 03.08.2019
 */

public interface RepositoryFacade {

    /**
     * Get the last modified repository by the organization name.
     *
     * @param organizationName organization name.
     * @return last modified repository {@link RepositoryData}.
     */
    RepositoryData getLastModifiedRepository(final String organizationName);

}
