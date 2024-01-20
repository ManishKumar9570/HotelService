package com.lcwd.hotel.service.services;

import com.lcwd.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create Hotel
    Hotel createHotel(Hotel hotel);

    //getAll Hotels
    List<Hotel> getAllHotels();
    //get single Hotel
    Hotel getHotelById(String hotelId);
}
