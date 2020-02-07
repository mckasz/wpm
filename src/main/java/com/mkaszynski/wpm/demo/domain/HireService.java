package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.BookDto;
import com.mkaszynski.wpm.demo.domain.dto.PaymentDto;
import lombok.RequiredArgsConstructor;

import static java.time.LocalDateTime.parse;

@RequiredArgsConstructor
public class HireService {

    private final CarDao carRepository;
    private final HireRepository hireRepository;

    public PaymentDto book(BookDto bookDto) {
        Car car = carRepository.find(bookDto.getVin());
        Hire hire = new Hire(car);

        int paymentAmount = hire.book(parse(bookDto.getFrom()), parse(bookDto.getTo()), bookDto.getUserId());

        hireRepository.save(hire);
        return new PaymentDto(paymentAmount);
    }
}
