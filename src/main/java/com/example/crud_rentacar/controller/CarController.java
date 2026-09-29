package com.example.crud_rentacar.controller;

import com.example.crud_rentacar.dto.CarRequestDto;
import com.example.crud_rentacar.dto.CarResponseDto;
import com.example.crud_rentacar.entity.Car;
import com.example.crud_rentacar.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    //POST localhost:8080/cars
    //GET localhost:8080/cars/1
    //DELETE /cars/1
    //PUT cars/1

    @PostMapping
    public Car createCar(@RequestBody CarRequestDto dto) {
        return carService.createCar(dto);
    }

    @GetMapping("/{id}")
    public CarResponseDto getCarById(@PathVariable Long id){
        return carService.getCarById(id);
    }

    @GetMapping("allcars")
    public List<Car> getAllCar() {
        return carService.getAllCar();
    }
    @PutMapping("updatescars")

    public CarResponseDto updateCar(Long id,CarResponseDto dto){
        return carService.updateCar( id , dto);
    }

}
