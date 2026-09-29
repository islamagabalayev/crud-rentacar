package com.example.crud_rentacar.dto;

import com.example.crud_rentacar.enums.CarCategory;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CarResponseDto {

    Long id;
    String brand;
    String model;
    String year;
    String mileage;
    Double dailyPrice;
    String description;
    CarCategory category;
}
