package com.example.crud_rentacar.service;

import com.example.crud_rentacar.dto.CarRequestDto;
import com.example.crud_rentacar.dto.CarResponseDto;
import com.example.crud_rentacar.entity.Car;
import com.example.crud_rentacar.exception.CarNotFoundException;
import com.example.crud_rentacar.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

     private final CarRepository carRepository;

    public Car createCar(CarRequestDto dto) {

//        Car car = new Car();
//        car.setBrand(dto.getBrand());
//        car.setModel(dto.getModel());
//        car.setYear(dto.getYear());
//        car.setMileage(dto.getMileage());
//        car.setDailyPrice(dto.getDailyPrice());
//        car.setDescription(dto.getDescription());
//        car.setCategory(dto.getCategory());

        Car car = Car.builder()
                .brand(dto.getBrand())
                .model(dto.getModel())
                .year(dto.getYear())
                .mileage(dto.getMileage())
                .dailyPrice(dto.getDailyPrice())
                .description(dto.getDescription())
                .category(dto.getCategory())
                .build();


        return carRepository.save(car);


    }

    public CarResponseDto getCarById(Long id) {

        Car car = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));

        return mapToCarDto(car);
    }

    CarResponseDto mapToCarDto(Car car) {

        return CarResponseDto.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .model(car.getModel())
                .year(car.getYear())
                .mileage(car.getMileage())
                .dailyPrice(car.getDailyPrice())
                .description(car.getDescription())
                .category(car.getCategory())
                .build();
    }
     public List<Car> getAllCar(){

        return carRepository.findAll();
     }
     public CarResponseDto updateCar(Long id , CarResponseDto dto){

         Car car = carRepository.findById(id).orElseThrow(
                 () -> new CarNotFoundException(id)
         );

         car.setBrand(dto.getBrand());
         car.setModel(dto.getModel());
         car.setYear(dto.getYear());
         car.setMileage(dto.getMileage());
         car.setDailyPrice(dto.getDailyPrice());
         car.setDescription(dto.getDescription());
         car.setCategory(dto.getCategory());

     return  mapToCarDto(car);
     }

}
