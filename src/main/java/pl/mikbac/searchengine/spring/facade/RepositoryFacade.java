package pl.mikbac.searchengine.spring.facade;

import pl.mikbac.searchengine.data.impl.RepositoryData;

/**
 * Created by MikBac on 03.08.2019
 */

public interface RepositoryFacade {

    RepositoryData getLastModifiedRepository(final String organizationName);

}
