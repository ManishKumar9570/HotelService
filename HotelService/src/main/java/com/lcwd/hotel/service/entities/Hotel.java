package com.lcwd.hotel.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;
}
