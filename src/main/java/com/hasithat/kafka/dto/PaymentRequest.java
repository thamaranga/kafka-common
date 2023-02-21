package com.hasithat.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

    private String transactionId;
    private String sourceAccount;
    private String destinationAccount;
    private double amount;
    private Date txDate;


}
