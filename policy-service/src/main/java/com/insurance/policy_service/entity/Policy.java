package com.insurance.policy_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "policies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;

    private String policyName;

    private double premium;

    private Long customerId;
}