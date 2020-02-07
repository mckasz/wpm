package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mkaszynski.wpm.demo.domain.Car.fromDto;
import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarDao carDao;

    public void createCar(CarDto carDto) {
        carDao.save(fromDto(carDto));
    }

    public List<CarDto> listCars() {
        return carDao.list()
                     .stream()
                     .map(Car::toListDto)
                     .collect(toList());
    }

}
