package com.mkaszynski.wpm.demo.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InMemoryCarRepository implements CarDao {
    private final Map<String, Car> cars = new HashMap<>();

    @Override
    public void save(Car car) {
        cars.put(car.vin(), car);
    }

    @Override
    public List<Car> list() {
        return new ArrayList<>(cars.values());
    }

    @Override
    public Car find(String vin) {
        return cars.get(vin);
    }
}
