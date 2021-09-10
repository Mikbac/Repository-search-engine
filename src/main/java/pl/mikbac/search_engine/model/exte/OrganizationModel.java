package pl.mikbac.search_engine.model.exte;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mikbac.search_engine.constants.EntityConstants.Organization;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Organization.TABLE)
public class OrganizationModel extends Model implements Serializable {

    @JsonProperty(Organization.LOGIN)
    String login;

    @JsonProperty(Organization.PUBLIC_REPOS)
    Integer publicRepos;

    @Override
    public String toString() {
        return "OrganizationModel{" +
                "login='" + login + '\'' +
                ", publicRepos=" + publicRepos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationModel that = (OrganizationModel) o;
        return login.equals(that.login) &&
                publicRepos.equals(that.publicRepos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, publicRepos);
    }
}
