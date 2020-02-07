package com.mkaszynski.wpm.demo.readmodel;

import lombok.Value;

@Value
class CarHire {
    private final String vin;
    private final String model;
    private final int numberOfSeats;

}
