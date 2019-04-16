package com.jopp.shopping.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerOrderController {

    @GetMapping("/{id}/orders")
    public String all(@PathVariable Long id) {
        return null;
    }

}
