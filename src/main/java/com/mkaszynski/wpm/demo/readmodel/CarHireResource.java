package com.mkaszynski.wpm.demo.readmodel;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/carHires")
@RequiredArgsConstructor
class CarHireResource {

    private final CarHireRepository carHireRepository;

    @GetMapping
    List<CarHire> listAll() {
        return carHireRepository.list();
    }
}
