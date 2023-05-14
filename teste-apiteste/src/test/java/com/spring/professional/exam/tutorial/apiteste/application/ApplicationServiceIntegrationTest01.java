package com.spring.professional.exam.tutorial.apiteste.application;

import com.spring.professional.exam.tutorial.apiteste.ds.Guest;
import com.spring.professional.exam.tutorial.apiteste.ds.Room;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.approachA.IntegrationTestBase;
import com.spring.professional.exam.tutorial.apiteste.integration.tests.configuration.TestDataConfiguration;
import com.spring.professional.exam.tutorial.apiteste.service.GuestSharableDataService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

//@DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)
public class ApplicationServiceIntegrationTest01 extends IntegrationTestBase {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private GuestSharableDataService guestSharableDataServiceMock;

    @Test
    public void shouldContainRoomsFromTestConfiguration() {
        Set<Room> roomsRegisteredInHotel = applicationService.listRooms();

        assertThat(roomsRegisteredInHotel.stream()
                .map(Room::getName)
                .collect(Collectors.toSet()))
                .containsOnly(TestDataConfiguration.GREEN_ROOM, TestDataConfiguration.YELLOW_ROOM, TestDataConfiguration.BLUE_ROOM);
    }

    @Test
    public void shouldContainGuestsFromTestDataScript() {
        List<Guest> guests = applicationService.listGuests();

        assertThat(guests).containsOnly(
                new Guest(1, "Earl", "Wilkerson"),
                new Guest(2, "Atif", "Melton"),
                new Guest(3, "Salma", "Sheridan")
        );
    }

    @Test
    public void shouldFetchGuestSharableData() {
        when(guestSharableDataServiceMock.getGuestSharableData()).thenReturn(SHARABLE_DATA);

        String guestSharableData = applicationService.getGuestSharableData();

        assertEquals(SHARABLE_DATA, guestSharableData);
    }

    private static final String SHARABLE_DATA = "FirstName1 LastName1, FirstName2 LastName2";
}