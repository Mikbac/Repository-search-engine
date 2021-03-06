package pl.MikBac.searchEngine.spring.controller.Pages;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.MikBac.searchEngine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

import static pl.MikBac.searchEngine.constants.WebConstants.Mapping.ROOT;
import static pl.MikBac.searchEngine.constants.WebConstants.Models.ORGANIZATION_NAME;
import static pl.MikBac.searchEngine.constants.WebConstants.Models.REPOSITORY_NAME;
import static pl.MikBac.searchEngine.constants.WebConstants.Views.Page.MAIN_PAGE;

/**
 * Created by MikBac on 2020
 */

@Controller(value = ROOT)
public class MainPageController {

    @Resource
    private RepositoryFacade repositoryFacade;

    @GetMapping()
    public String getView(@RequestParam(required = false) final String organizationName, final Model model) {

        if (StringUtils.isNotBlank(organizationName)) {
            model.addAttribute(REPOSITORY_NAME, repositoryFacade.getLastModifiedRepository(organizationName).getRepositoryName());
            model.addAttribute(ORGANIZATION_NAME, organizationName);
        }

        return MAIN_PAGE;
    }

}
