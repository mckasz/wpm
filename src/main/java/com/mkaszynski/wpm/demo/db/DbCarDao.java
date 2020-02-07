package com.mkaszynski.wpm.demo.db;

import com.mkaszynski.wpm.demo.domain.Car;
import com.mkaszynski.wpm.demo.domain.CarDao;

import java.util.List;
import java.util.stream.Collectors;

public class DbCarDao implements CarDao {

    private DbCarRepository repository;

    public DbCarDao(DbCarRepository repository) {
        this.repository = repository;
        this.save(new Car("1", "Ford", 5, true, "Manual", "ford.jpeg"));
        this.save(new Car("2", "Toyota", 5, true, "Manual", "toyota.jpeg"));
        this.save(new Car("3", "Lexus", 5, true, "Manual", "lexus.jpeg"));
        this.save(new Car("4", "Fiat", 3, true, "Manual", "fiat.jpeg"));
    }

    @Override
    public void save(Car car) {
        repository.save(car.toEntity());
    }

    @Override
    public List<Car> list() {
        return repository.findAll().stream().map(CarEntity::toDomain).collect(Collectors.toList());
    }

    @Override
    public Car find(String vin) {
        return repository
                .findById(vin)
                .orElseThrow(() -> new IllegalStateException("Unable to find car for given VIN: " + vin))
                .toDomain();
    }
}
