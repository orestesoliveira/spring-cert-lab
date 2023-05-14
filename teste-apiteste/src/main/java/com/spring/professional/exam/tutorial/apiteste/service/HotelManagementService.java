package com.spring.professional.exam.tutorial.apiteste.service;

import com.spring.professional.exam.tutorial.apiteste.ds.Room;
import com.spring.professional.exam.tutorial.apiteste.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HotelManagementService {

    @Autowired
    private RoomRepository roomRepository;

    public void registerRoom(Room room) {
        roomRepository.save(room);
    }

    public Set<Room> listRooms() {
        return roomRepository.findAll();
    }
}
