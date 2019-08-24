package pl.MikBac.searchEngine.spring.repository;

import pl.MikBac.searchEngine.model.RepositoryModel;

import java.util.List;

/**
 * Created by MikBac on 24.08.2019
 */

public interface RepositoryRepository {

    List<RepositoryModel> getRepositories(final String organizationName, final int pagesNumber);

}
