/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.MikBac.searchEngine.constants.ModelsConstants.Organization;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = Organization.TABLE)
public class OrganizationModel {

    @JsonProperty(Organization.LOGIN)
    String login;

    @JsonProperty(Organization.PUBLIC_REPOS)
    int publicRepos;
}
