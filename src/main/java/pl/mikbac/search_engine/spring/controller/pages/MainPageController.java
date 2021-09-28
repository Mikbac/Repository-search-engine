package pl.mikbac.search_engine.spring.controller.pages;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mikbac.search_engine.exception.ApiRateLimitException;
import pl.mikbac.search_engine.exception.RepositoryNotFoundException;
import pl.mikbac.search_engine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;
import java.util.Locale;

import static pl.mikbac.search_engine.constants.WebConstants.Mapping.ROOT;
import static pl.mikbac.search_engine.constants.WebConstants.Models.Attributes.MESSAGE;
import static pl.mikbac.search_engine.constants.WebConstants.Models.Attributes.ORGANIZATION_NAME;
import static pl.mikbac.search_engine.constants.WebConstants.Models.Attributes.REPOSITORY_NAME;
import static pl.mikbac.search_engine.constants.WebConstants.Models.Messages.API_RATE_LIMIT_EXCEPTION;
import static pl.mikbac.search_engine.constants.WebConstants.Models.Messages.REPOSITORY_NOT_FOUND_EXCEPTION;
import static pl.mikbac.search_engine.constants.WebConstants.Views.Page.MAIN_PAGE;

/**
 * Created by MikBac on 2020
 */

@Controller(value = ROOT)
public class MainPageController {

    @Resource
    private RepositoryFacade repositoryFacade;

    @Resource
    private MessageSource messageSource;

    @GetMapping()
    public String getView(@RequestParam(required = false) final String organizationName, final Model model) {
        try {
            if (StringUtils.isNotBlank(organizationName)) {
                model.addAttribute(REPOSITORY_NAME, repositoryFacade.getLastModifiedRepository(organizationName).getRepositoryName());
                model.addAttribute(ORGANIZATION_NAME, organizationName);
            }
        } catch (ApiRateLimitException e) {
            model.addAttribute(MESSAGE, messageSource.getMessage(API_RATE_LIMIT_EXCEPTION, null, Locale.getDefault()));
        } catch (RepositoryNotFoundException e) {
            model.addAttribute(MESSAGE, messageSource.getMessage(REPOSITORY_NOT_FOUND_EXCEPTION, null, Locale.getDefault()));
        }
        return MAIN_PAGE;
    }

}
