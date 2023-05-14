package com.spring.professional.exam.tutorial.apiteste.integration.tests.approachC;

import com.spring.professional.exam.tutorial.apiteste.configuration.ApplicationConfiguration;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration.MockitoConfiguration;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration.TestDataConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ContextConfiguration(classes = {TestDataConfiguration.class, MockitoConfiguration.class})
public class IntegrationTestConfiguration extends ApplicationConfiguration {
}
