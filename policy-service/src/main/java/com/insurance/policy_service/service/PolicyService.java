package com.insurance.policy_service.service;

import com.insurance.policy_service.client.CustomerClient;
import com.insurance.policy_service.dto.CustomerDTO;
import com.insurance.policy_service.dto.PolicyResponseDTO;
import com.insurance.policy_service.entity.Policy;
import com.insurance.policy_service.repository.PolicyRepository;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private final PolicyRepository repository;
    private final CustomerClient customerClient;

    public PolicyService(PolicyRepository repository, CustomerClient customerClient) {
        this.repository = repository;
        this.customerClient = customerClient;
    }

    public PolicyResponseDTO getPolicyWithCustomer(Long policyId) {

        Policy policy = repository.findById(policyId).orElse(null);

        CustomerDTO customer = customerClient.getCustomer(policy.getCustomerId());

        PolicyResponseDTO response = new PolicyResponseDTO();
        response.setPolicyId(policy.getPolicyId());
        response.setPolicyName(policy.getPolicyName());
        response.setPremium(policy.getPremium());
        response.setCustomer(customer);

        return response;
    }

    public Policy createPolicy(Policy policy){
        return repository.save(policy);
    }
}