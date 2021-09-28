package com.chase.chasecodinttest.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "providers")
public class Providers {
    private List<String> name;
    private List<String> url;

    public List<String> getNames() {
        return name;
    }
    public List<String> getUrls() {
        return url;
    }


}