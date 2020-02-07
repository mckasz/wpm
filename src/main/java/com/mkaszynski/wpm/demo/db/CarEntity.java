package com.mkaszynski.wpm.demo.db;

import com.mkaszynski.wpm.demo.domain.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    private String vin;
    private String model;
    private int numberOfSeats;
    private boolean airCondition;
    private String transmission;
    private String imagePath;

    Car toDomain() {
        return new Car(vin, model, numberOfSeats, airCondition, transmission, imagePath);
    }
}
