package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.CarDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class CarServiceTest {

    private CarService carService = new CarService(new InMemoryCarRepository());

    @DisplayName("Created cars can be listed and is marked as available")
    @Test
    void createList() {
        carService.createCar(ford());

        List<CarDto> cars = carService.listCars();

        assertThat(cars).contains(ford());
    }

    private CarDto ford() {
        return new CarDto("VIN456789", "Ford", 5);
    }

}