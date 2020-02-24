package pl.MikBac.searchEngine.spring.facade;

import pl.MikBac.searchEngine.data.impl.RepositoryData;

/**
 * Created by MikBac on 03.08.2019
 */

public interface RepositoryFacade {

    RepositoryData getLastModifiedRepository(final String organizationName);

}
