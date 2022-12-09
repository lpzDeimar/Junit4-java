package com.platzi.javaTests.Payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
