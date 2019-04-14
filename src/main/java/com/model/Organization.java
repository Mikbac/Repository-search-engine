package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {

    @JsonProperty("login")
    String name;

    @JsonProperty("public_repos")
    int numberOfRepositories;
}
