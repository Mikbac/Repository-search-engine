/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.service;

import pl.MikBac.searchEngine.model.Repository;

import java.util.List;

public interface RepositoryService {

    List<Repository> getAllRepositories(String organizationName) throws Exception;

    int getNumberOfRepositories(String organizationName);

    Repository getLastUpdatedRepository(String organizationName) throws Exception;
}
