package pl.MikBac.searchEngine.data.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.MikBac.searchEngine.data.Data;

/**
 * Created by MikBac on 24.02.2020
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RepositoryData implements Data {

    private String repositoryName;
    private String lastUpdate;

}
