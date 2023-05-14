package com.spring.professional.exam.tutorial.apiteste.integration.tests.approachD;

import com.spring.professional.exam.tutorial.apiteste.configuration.ApplicationConfiguration;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration.MockitoConfiguration;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration.TestDataConfiguration;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ApplicationConfiguration.class, TestDataConfiguration.class, MockitoConfiguration.class})
public interface IntegrationTestBaseIfc {
}
