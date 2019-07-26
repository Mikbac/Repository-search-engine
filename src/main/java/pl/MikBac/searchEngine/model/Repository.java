/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

    @JsonProperty("name")
    private String repositoryName;

    @JsonProperty("pushed_at")
    private String lastUpdate;
}
