package pl.mikbac.search_engine.constants;

/**
 * Created by MikBac on 18.08.2019
 */

public interface WebConstants {

    interface Mapping {
        String ROOT = "/";
        String REPOSITORY = "/repository";
        String LAST_MODIFIED_REPOSITORY = "/last-modified/{organization}";
    }

    interface Views {
        interface Page {
            String PAGE_CATALOG = "pages";
            String MAIN_PAGE = PAGE_CATALOG + "/" + "mainPage";
        }
    }

    interface Models {
        String REPOSITORY_NAME = "repositoryName";
        String ORGANIZATION_NAME = "organizationName";
    }

}
