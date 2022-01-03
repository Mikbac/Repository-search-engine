package pl.mikbac.search_engine.model.exte;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.mikbac.search_engine.model.AbstractModel;

import javax.persistence.Table;
import java.io.Serializable;

import static pl.mikbac.search_engine.constants.EntityConstants.Organization;

/**
 * Created by MikBac on 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Organization.TABLE)
public class OrganizationModel extends AbstractModel implements Serializable {

    @JsonProperty(Organization.LOGIN)
    String login;

    @JsonProperty(Organization.PUBLIC_REPOS)
    Integer publicRepos;

}
