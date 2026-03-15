package com.insurance.policy_service.controller;

import com.insurance.policy_service.client.CustomerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    private final CustomerClient customerClient;

    public PolicyController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/customer/{id}")
    public String getPolicyByCustomer(@PathVariable Long id) {

        String customer = customerClient.getCustomer(id);

        return "Policy for -> " + customer;
    }
}
