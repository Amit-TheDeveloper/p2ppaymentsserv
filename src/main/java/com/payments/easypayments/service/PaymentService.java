package com.payments.easypayments.service;

import com.payments.easypayments.model.PaymentRequest;
import com.payments.easypayments.model.PaymentResponse;
import com.payments.easypayments.model.RiskScore;
import com.payments.easypayments.service.proxies.RiskServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    RiskServiceProxy riskServiceProxy;

    public PaymentResponse handlePaymentRequest(PaymentRequest paymentRequest) {

        // TODO validate paymentRequest

        RiskScore fromPhoneNoRisk = verifyRisk(paymentRequest.getFromPhoneNo());
        RiskScore toPhoneNoRisk = verifyRisk(paymentRequest.getToPhoneNo());

        if(risk) {
            throw new RuntimeException("Risky Transaction, not proceeding");
        }


        return null;
    }


    public RiskScore verifyRisk(String phoneNo) {
            // call risk service using feign
        RiskScore risk = riskServiceProxy.retrieveRiskScore(phoneNo);




        return null;
    }



}
