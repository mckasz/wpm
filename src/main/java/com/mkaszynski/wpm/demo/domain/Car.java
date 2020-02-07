package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.db.CarEntity;
import com.mkaszynski.wpm.demo.domain.dto.CarDto;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public
class Car {
    private final String vin;
    private final String model;
    private final int numberOfSeats;
    private final boolean airCondition;
    private final String transmission;
    private final String imagePath;

    public Car(String vin, String model, int numberOfSeats, boolean airCondition, String transmission, String imagePath) {
        this.vin = vin;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.airCondition = airCondition;
        this.transmission = transmission;
        this.imagePath = imagePath;
    }

    public String vin() {
        return vin;
    }

    CarDto toListDto() {
        return new CarDto(vin, model, numberOfSeats, airCondition, transmission, imagePath);
    }

    public CarEntity toEntity() {
        return new CarEntity(vin, model, numberOfSeats, airCondition, transmission, imagePath);
    }

    static Car fromDto(CarDto carDto) {
        return new Car(carDto.getVin(),
                       carDto.getModel(),
                       carDto.getNumberOfSeats(),
                       carDto.isAirCondition(),
                       carDto.getTransmission(),
                       carDto.getImagePath());
    }
}
