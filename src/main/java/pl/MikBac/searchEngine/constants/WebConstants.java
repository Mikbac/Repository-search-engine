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
        String MAIN_PAGE = "main";
    }

    interface Models {
        String REPOSITORY_NAME = "repositoryName";
    }

}
