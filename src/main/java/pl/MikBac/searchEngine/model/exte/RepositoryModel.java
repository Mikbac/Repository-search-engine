package pl.MikBac.searchEngine.model.exte;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.MikBac.searchEngine.constants.EntityConstants.Repository;
import pl.MikBac.searchEngine.model.Model;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
    @NotNull
    private String repositoryName;

    @JsonProperty(Repository.PUSHED_AT)
    @NotNull
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
