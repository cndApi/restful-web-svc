package com.ssc.taa.webservice.controller;

import com.ssc.taa.webservice.model.RoomDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.ssc.taa.webservice.service.RoomsBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/")
public class RoomsController  {
    @Autowired
    RoomsBookingService roomsBookingService;

    @GetMapping
    public String home() {
        return "Welcome to the Restful Web Services Application!";
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<RoomDetails>> getRooms (){
        return new ResponseEntity<>(roomsBookingService.getRoomsList(), HttpStatus.OK);

    }

}
