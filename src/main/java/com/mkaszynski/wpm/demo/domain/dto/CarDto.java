package com.mkaszynski.wpm.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private String vin;
    private String model;
    private int numberOfSeats;
    private boolean airCondition;
    private String transmission;
    private String imagePath;
}
