package pl.mikbac.search_engine.model.exte;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.mikbac.search_engine.model.AbstractModel;

import javax.persistence.Table;
import java.io.Serializable;

import static pl.mikbac.search_engine.constants.EntityConstants.Repository;

/**
 * Created by MikBac on 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Repository.TABLE)
public class RepositoryModel extends AbstractModel implements Serializable {

    @JsonProperty(Repository.NAME)
    private String repositoryName;

    @JsonProperty(Repository.PUSHED_AT)
    private String lastUpdate;

}
