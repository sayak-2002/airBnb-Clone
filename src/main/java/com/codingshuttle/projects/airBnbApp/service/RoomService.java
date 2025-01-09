package com.codingshuttle.projects.airBnbApp.service;


import com.codingshuttle.projects.airBnbApp.dto.RoomDto;

import java.util.List;

public interface RoomService {

    RoomDto createNewRoom(Long HotelId, RoomDto roomDto);

    List<RoomDto> getAllRoomsIHotel(Long hotelId);

    RoomDto getRoomById(Long roomId);

    void deleteRoomById(Long roomId);
}
