package pl.mikbac.searchengine.spring.facade.impl;

import org.springframework.stereotype.Component;
import pl.mikbac.searchengine.data.impl.RepositoryData;
import pl.mikbac.searchengine.model.exte.RepositoryModel;
import pl.mikbac.searchengine.spring.converter.Converter;
import pl.mikbac.searchengine.spring.facade.RepositoryFacade;
import pl.mikbac.searchengine.spring.service.RepositoryService;

import javax.annotation.Resource;

/**
 * Created by MikBac on 03.08.2019
 */

@Component
public class RepositoryFacadeImpl implements RepositoryFacade {

    @Resource
    private RepositoryService repositoryService;
    @Resource
    private Converter<RepositoryData, RepositoryModel> repositoryDataRepositoryModelConverter;

    @Override
    public RepositoryData getLastModifiedRepository(final String organizationName) {
        return repositoryDataRepositoryModelConverter.convert(repositoryService.getLastUpdatedRepository(organizationName));
    }
}
