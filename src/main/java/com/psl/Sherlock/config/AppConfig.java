package com.psl.Sherlock.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({
	"classpath:env.properties",
	"classpath:env.properties" //if same key, this will 'win'
})
public class AppConfig {
	@Autowired
	Environment env;
}
