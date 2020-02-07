package com.mkaszynski.wpm.demo.domain;

import com.mkaszynski.wpm.demo.domain.dto.BookDto;
import com.mkaszynski.wpm.demo.domain.dto.PaymentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@RequestMapping
public class HireResource {

    private final HireService hireService;

    @PostMapping("/book")
    private PaymentDto book(@RequestParam BookDto bookDto) {
        return hireService.book(bookDto);
    }
}
