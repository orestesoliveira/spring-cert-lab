package com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration;

import com.spring.professional.exam.tutorial.apiteste.service.GuestSharableDataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class MockitoConfiguration {

    @Bean
    public GuestSharableDataService guestSharableDataService() {
        return mock(GuestSharableDataService.class);
    }
}
