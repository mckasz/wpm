package com.mkaszynski.wpm.demo.domain.dto;

import lombok.Value;

@Value
public class BookDto {
    private final String vin;
    private final String userId;
    private final String from;
    private final String to;

}
