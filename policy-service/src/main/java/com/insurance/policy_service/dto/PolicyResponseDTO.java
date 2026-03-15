package com.insurance.policy_service.dto;

import lombok.Data;

@Data
public class PolicyResponseDTO {

    private Long policyId;
    private String policyName;
    private double premium;
    private CustomerDTO customer;
}