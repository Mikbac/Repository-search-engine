package pl.mikbac.search_engine.exception;

/**
 * Created by MikBac on 2019
 */

public class RepositoryNotFoundException extends RuntimeException {

    public RepositoryNotFoundException(String organizationName) {
        super("Repository not found for organizationName: " + organizationName);
    }

}
