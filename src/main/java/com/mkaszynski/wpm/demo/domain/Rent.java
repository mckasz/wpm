package com.mkaszynski.wpm.demo.domain;

class Rent {
    private int rate;

    public Rent(int rate) {
        this.rate = rate;
    }

    int forDays(int days) {
        return rate * days;
    }
}
