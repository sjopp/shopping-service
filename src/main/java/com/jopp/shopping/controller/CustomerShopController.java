package com.jopp.shopping.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Slf4j
@RestController
public class CustomerShopController {

    @PostMapping(value = "/update/{customerId}", consumes = APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseEntity<String> updateCustomer() {
        // Add mapper
        // Call to database to update tables
        // return response based on result
        return null;
    }
}
