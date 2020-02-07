package com.mkaszynski.wpm.demo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentTest {

    @Test
    void shouldReturn700_whenCarWasHiredFor7Days() {
        Rent rent = new Rent(100);

        int result = rent.forDays(7);

        assertThat(result).isEqualTo(500);
    }

    @Test
    void name() {

    }
}
