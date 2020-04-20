/*
 * Created by mikbac1 on 2020
 */

package pl.MikBac.searchEngine.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.MikBac.searchEngine.constants.WebConstants.Mapping;
import pl.MikBac.searchEngine.constants.WebConstants.Views;
import pl.MikBac.searchEngine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

import static pl.MikBac.searchEngine.constants.WebConstants.Models.REPOSITORY_NAME;

/**
 * Created by MikBac on 2020
 */

@Controller
public class RepositoryController {

    @Resource
    private RepositoryFacade repositoryFacade;

    @GetMapping(value = Mapping.REPOSITORY)
    public String getView(@RequestParam(required = false) final String organizationName, final Model model) {

        if (organizationName != null) {
            model.addAttribute(REPOSITORY_NAME, repositoryFacade.getLastModifiedRepository(organizationName).getRepositoryName());
        }

        return Views.MAIN_PAGE;
    }

}
