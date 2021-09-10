package pl.mikbac.search_engine.spring.repository;

import pl.mikbac.search_engine.model.exte.RepositoryModel;

import java.util.List;

/**
 * Created by MikBac on 24.08.2019
 */

public interface RepositoryRepository {

    List<RepositoryModel> getRepositories(final String organizationName, final int pagesNumber);

}
