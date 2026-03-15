package com.insurance.policy_service.dto;

import lombok.Data;

@Data
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String city;
}