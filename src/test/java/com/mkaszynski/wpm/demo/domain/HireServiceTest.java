package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.BookDto;
import com.mkaszynski.wpm.demo.domain.dto.CarDto;
import com.mkaszynski.wpm.demo.domain.dto.PaymentDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HireServiceTest {

    private InMemoryCarRepository carRepository = new InMemoryCarRepository();
    private CarService carService = new CarService(carRepository);
    private HireService hireService = new HireService(carRepository, new InMemoryHireRepository());

    @DisplayName("Book Ford for 10 days")
    @Test
    void book() {
        carService.createCar(ford());

        PaymentDto payment = hireService.book(fordFor10Days());

        assertThat(payment).isEqualTo(new PaymentDto(1000));
    }

    private BookDto fordFor10Days() {
        return new BookDto("VIN456789", "UserId_1", "2020-01-10T12:00:00", "2020-01-20T12:00:00");
    }

    private CarDto ford() {
        return new CarDto("VIN456789", "Ford", 5);
    }
}