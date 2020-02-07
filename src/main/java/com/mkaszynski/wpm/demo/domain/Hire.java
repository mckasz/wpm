package com.mkaszynski.wpm.demo.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Hire {
    private LocalDateTime from, to;
    private String userId;
    private Car car;
    private Integer id;

    public Hire(Car car) {
        this.car = car;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    int book(LocalDateTime from, LocalDateTime to, String userId) {
        this.from = from;
        this.to = to;
        this.userId = userId;

        Duration duration = Duration.between(from, to);
        long numberOfDays = duration.get(ChronoUnit.SECONDS) / 60 / 60 / 24;
        return (int) (numberOfDays * 100);
    }
}
