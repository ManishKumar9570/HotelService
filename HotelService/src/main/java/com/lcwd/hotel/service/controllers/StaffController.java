package com.lcwd.hotel.service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("staffs")
public class StaffController {

    @GetMapping()
    public ResponseEntity<List<String>> getAllStaff(){
        List<String> staffs = List.of("Ram", "Sita", "Gita", "Mohan");
        return ResponseEntity.status(HttpStatus.OK).body(staffs);
    }
}
