package com.insurance.policy_service.controller;

import com.insurance.policy_service.client.CustomerClient;
import com.insurance.policy_service.dto.PolicyResponseDTO;
import com.insurance.policy_service.entity.Policy;
import com.insurance.policy_service.service.PolicyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    private final PolicyService service;

    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy){
        return service.createPolicy(policy);
    }

    @GetMapping("/{id}")
    public PolicyResponseDTO getPolicy(@PathVariable Long id){
        return service.getPolicyWithCustomer(id);
    }
}
