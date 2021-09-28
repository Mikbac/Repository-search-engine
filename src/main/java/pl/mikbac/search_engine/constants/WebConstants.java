package pl.mikbac.search_engine.constants;

/**
 * Created by MikBac on 18.08.2019
 */

public interface WebConstants {

    interface Mapping {
        String ROOT = "/";
        String API = "/api";
        String REPOSITORIES = API + "/repositories";
        String LAST_MODIFIED_REPOSITORY = "/last-modified/{organizationName}";
    }

    interface Views {
        interface Page {
            String PAGE_CATALOG = "pages";
            String MAIN_PAGE = PAGE_CATALOG + "/" + "mainPage";
        }
    }

    interface Models {
        interface Attributes {
            String REPOSITORY_NAME = "repositoryName";
            String ORGANIZATION_NAME = "organizationName";
            String MESSAGE = "message";
        }

        interface Messages {
            String API_RATE_LIMIT_EXCEPTION = "main.page.body.repository.search.exception.api.rate.limit";
            String REPOSITORY_NOT_FOUND_EXCEPTION = "main.page.body.repository.search.exception.repository.not.found";
        }
    }

}
