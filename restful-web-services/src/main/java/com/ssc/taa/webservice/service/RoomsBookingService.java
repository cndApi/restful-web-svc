package com.ssc.taa.webservice.service;
import com.ssc.taa.webservice.model.RoomDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomsBookingService {
    public List<RoomDetails> getRoomsList() {
        List<RoomDetails> roomDetailsList = new ArrayList<>();
        RoomDetails roomOneDetails = new RoomDetails();
        roomOneDetails.setRoomGuid("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        roomOneDetails.setRoomNumber(111);
        roomOneDetails.setRoomType("VIP Cottage");
        roomDetailsList.add(roomOneDetails);
        System.out.println("Hello RoomsBookingService");
        return roomDetailsList;

    }
}
