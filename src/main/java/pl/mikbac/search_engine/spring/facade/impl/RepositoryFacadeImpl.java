package pl.mikbac.search_engine.spring.facade.impl;

import org.springframework.stereotype.Component;
import pl.mikbac.search_engine.data.impl.RepositoryData;
import pl.mikbac.search_engine.model.exte.RepositoryModel;
import pl.mikbac.search_engine.spring.converter.Converter;
import pl.mikbac.search_engine.spring.facade.RepositoryFacade;
import pl.mikbac.search_engine.spring.service.RepositoryService;

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
