package com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration;

import com.spring.professional.exam.tutorial.apiteste.ds.Guest;
import com.spring.professional.exam.tutorial.apiteste.ds.Room;
import com.spring.professional.exam.tutorial.apiteste.service.GuestRegistrationService;
import com.spring.professional.exam.tutorial.apiteste.service.HotelManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class TestDataConfiguration {

    public static final String GREEN_ROOM = "Green Room";
    public static final String YELLOW_ROOM = "Yellow Room";
    public static final String BLUE_ROOM = "Blue Room";

    @Autowired
    private HotelManagementService hotelManagementService;
    @Autowired
    private GuestRegistrationService guestRegistrationService;

    @PostConstruct
    private void registerHotelRooms() {
        hotelManagementService.registerRoom(new Room(GREEN_ROOM, "A01"));
        hotelManagementService.registerRoom(new Room(YELLOW_ROOM, "A02"));
        hotelManagementService.registerRoom(new Room(BLUE_ROOM, "B01"));
    }

    @PostConstruct
    private void registerGuests() {
        guestRegistrationService.registerGuest(new Guest("Earl", "Wilkerson"));
        guestRegistrationService.registerGuest(new Guest("Atif", "Melton"));
        guestRegistrationService.registerGuest(new Guest("Salma", "Sheridan"));
    }
}
