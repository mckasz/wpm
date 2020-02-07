package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.CarDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarResource {
    private final CarService carService;

    public CarResource(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public @ResponseBody
    List<CarDto> getCars() {
        return carService.listCars();
    }

    @PostMapping(
            value = "/cars",
            consumes = "application/json",
            produces = "application/json")
    public void createCar(@RequestBody CarDto carDto) {
        carService.createCar(carDto);
    }
}
