package pl.MikBac.searchEngine.spring.property;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by MikBac on 02.05.2021
 */

@Setter
@Getter
@ConfigurationProperties(prefix = "github.api.organization")
public class GithubProperties {

    @NonNull
    private String url;

}
