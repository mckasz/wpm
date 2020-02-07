package com.mkaszynski.wpm.demo.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Time {
    private LocalDateTime from;

    public Time(LocalDateTime from) {
        this.from = from;
    }

    String toIso() {
        return from.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
