package pl.mikbac.search_engine.data.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import pl.mikbac.search_engine.data.Data;

/**
 * Created by MikBac on 24.02.2020
 */

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RepositoryData implements Data {

    private String repositoryName;
    private String lastUpdate;

}
