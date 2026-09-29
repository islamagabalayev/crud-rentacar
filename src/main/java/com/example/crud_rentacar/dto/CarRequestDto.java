package com.example.crud_rentacar.dto;

import com.example.crud_rentacar.enums.CarCategory;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarRequestDto {

    String brand;
    String model;
    String year;
    String mileage;
    Double dailyPrice;
    String description;
    CarCategory category;
}
