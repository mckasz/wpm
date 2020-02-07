package com.mkaszynski.wpm.demo.domain.dto;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class PaymentDto {
    private int amount;

    public PaymentDto(int amount) {
        this.amount = amount;
    }
}
