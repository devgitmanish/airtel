package com.interview.practice.SolidPrincipal.SingleResponsibility;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Account {

    private int accountNumber;
    private String firstName;
    private BigDecimal totalAmount;

}
