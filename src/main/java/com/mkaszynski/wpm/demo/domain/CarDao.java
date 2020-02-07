package com.mkaszynski.wpm.demo.domain;

import java.util.List;

public interface CarDao {
    void save(Car car);
    List<Car> list();
    Car find(String vin);
}
