/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.MikBac.searchEngine.constants.ModelsConstants.Repository;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Repository.TABLE)
public class RepositoryModel {

    @JsonProperty(Repository.NAME)
    private String repositoryName;

    @JsonProperty(Repository.PUSHED_AT)
    private String lastUpdate;
}
