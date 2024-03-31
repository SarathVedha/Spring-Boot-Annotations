package com.vedha.annotations.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:custom.properties")
//@PropertySource("classpath:custom2.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom2.properties")
})
public class PropertySourceAnno {
}
