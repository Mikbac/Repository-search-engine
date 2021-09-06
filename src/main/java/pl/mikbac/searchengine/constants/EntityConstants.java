package pl.mikbac.searchengine.constants;

/**
 * Created by MikBac on 04.08.2019
 */

public interface EntityConstants {

    interface Organization {
        String TABLE = "OrganizationModel";
        String LOGIN = "login";
        String PUBLIC_REPOS = "public_repos";
    }

    interface Repository {
        String TABLE = "RepositoryModel";
        String NAME = "name";
        String PUSHED_AT = "pushed_at";
    }

}
