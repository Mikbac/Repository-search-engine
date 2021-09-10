package pl.mikbac.search_engine.spring.facade;

import pl.mikbac.search_engine.data.impl.RepositoryData;

/**
 * Created by MikBac on 03.08.2019
 */

public interface RepositoryFacade {

    RepositoryData getLastModifiedRepository(final String organizationName);

}
