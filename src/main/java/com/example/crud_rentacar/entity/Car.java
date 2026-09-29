package com.example.crud_rentacar.entity;

import com.example.crud_rentacar.enums.CarCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

//ORM-object relation mapping
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String brand;
    String model;
    String year;
    String mileage;
    Double dailyPrice;
    String description;
    @Enumerated(EnumType.STRING)
    CarCategory category;
}
