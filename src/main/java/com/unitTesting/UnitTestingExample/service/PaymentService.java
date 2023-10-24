package com.unitTesting.UnitTestingExample.service;

import java.util.Random;
import org.springframework.stereotype.Service;

public class PaymentService {

    public Boolean processPayment() {
        return new Random().nextBoolean();
    }
}
