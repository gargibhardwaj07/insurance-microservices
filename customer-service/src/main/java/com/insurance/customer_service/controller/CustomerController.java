package com.insurance.customer_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable Long id) {

        return "Customer details for ID: " + id;
    }
}