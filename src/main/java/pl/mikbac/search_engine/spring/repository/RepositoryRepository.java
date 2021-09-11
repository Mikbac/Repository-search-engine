package pl.mikbac.search_engine.spring.repository;

import pl.mikbac.search_engine.data.impl.RepositoryData;
import pl.mikbac.search_engine.model.exte.RepositoryModel;

import java.util.List;

/**
 * Created by MikBac on 24.08.2019
 */

public interface RepositoryRepository {

    /**
     * Get the list of repositories from the selected page.
     *
     * @param organizationName organization name.
     * @param pagesNumber      page number.
     * @return list of repositories {@link RepositoryData}.
     */
    List<RepositoryModel> getRepositories(final String organizationName, final int pagesNumber);

}
