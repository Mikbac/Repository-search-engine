package pl.mikbac.searchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import pl.mikbac.searchengine.spring.property.GithubProperties;

/**
 * Created by MikBac on 2019
 */

@SpringBootApplication(scanBasePackages = {"pl.mikbac.searchengine.spring"})
@EntityScan(basePackages = {"pl.mikbac.searchengine.model"})
@EnableConfigurationProperties(value = {GithubProperties.class})
public class WebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
