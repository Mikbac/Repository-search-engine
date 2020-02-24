package pl.MikBac.searchEngine.spring.converter.impl;

import org.springframework.stereotype.Service;
import pl.MikBac.searchEngine.data.impl.RepositoryData;
import pl.MikBac.searchEngine.model.exte.RepositoryModel;
import pl.MikBac.searchEngine.spring.converter.Converter;

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
