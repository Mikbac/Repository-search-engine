package pl.MikBac.searchEngine.constants;

/**
 * Created by MikBac on 18.08.2019
 */

public interface WebConstants {

    interface Mapping {
        String ROOT = "/";
        String LAST_MODIFIED_REPOSITORY = ROOT + "/last-modified-repository";
        String REPOSITORY = ROOT + "/repository";
    }

    interface Views {
        interface Page {
            String PAGE_CATALOG = "pages";
            String MAIN_PAGE = PAGE_CATALOG + "/" + "mainPage";
        }
    }

    interface Models {
        String REPOSITORY_NAME = "repositoryName";
    }

}
