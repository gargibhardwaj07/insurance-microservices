package com.insurance.policy_service.client;

import com.insurance.policy_service.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "customer-service")
public interface CustomerClient {

    @GetMapping("/customers/{id}")
    CustomerDTO getCustomer(@PathVariable Long id);


}