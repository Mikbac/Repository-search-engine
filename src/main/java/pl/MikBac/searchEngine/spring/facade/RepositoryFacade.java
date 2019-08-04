/**
 * Created by MikBac on 03.08.2019
 */

package pl.MikBac.searchEngine.spring.facade;

import pl.MikBac.searchEngine.model.RepositoryModel;

public interface RepositoryFacade {

    RepositoryModel getLastModifiedRepository(final String organizationName);

}
