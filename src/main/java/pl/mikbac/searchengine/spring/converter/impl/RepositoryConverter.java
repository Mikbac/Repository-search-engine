package pl.mikbac.searchengine.spring.converter.impl;

import org.springframework.stereotype.Service;
import pl.mikbac.searchengine.data.impl.RepositoryData;
import pl.mikbac.searchengine.model.exte.RepositoryModel;
import pl.mikbac.searchengine.spring.converter.Converter;

/**
 * Created by MikBac on 24.02.2020
 */

@Service
public class RepositoryConverter implements Converter<RepositoryData, RepositoryModel> {
    @Override
    public RepositoryData convert(RepositoryModel model) {
        return RepositoryData.builder()
                .repositoryName(model.getRepositoryName())
                .lastUpdate(model.getLastUpdate())
                .build();
    }

    @Override
    public RepositoryModel inverseConvert(RepositoryData data) {
        return RepositoryModel.builder()
                .repositoryName(data.getRepositoryName())
                .lastUpdate(data.getLastUpdate())
                .build();
    }
}
