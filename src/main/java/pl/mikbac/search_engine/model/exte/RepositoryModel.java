package pl.mikbac.search_engine.model.exte;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mikbac.search_engine.constants.EntityConstants.Repository;
import pl.mikbac.search_engine.model.Model;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by MikBac on 2019
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Repository.TABLE)
public class RepositoryModel extends Model implements Serializable {

    @JsonProperty(Repository.NAME)
    private String repositoryName;

    @JsonProperty(Repository.PUSHED_AT)
    private String lastUpdate;

    @Override
    public String toString() {
        return "RepositoryModel{" +
                "repositoryName='" + repositoryName + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepositoryModel that = (RepositoryModel) o;
        return repositoryName.equals(that.repositoryName) &&
                lastUpdate.equals(that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryName, lastUpdate);
    }
}
