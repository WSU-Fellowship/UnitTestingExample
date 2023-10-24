package com.unitTesting.UnitTestingExample.service;

import com.unitTesting.UnitTestingExample.exception.CustomerDoesNotExistException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountServiceTests {

    private final BankAccountService bankAccountService = new BankAccountService();

    @Test
    void getCustomerBalance_whenNoCustomer_throwsException() {
        assertThrows(CustomerDoesNotExistException.class, () -> bankAccountService.getCustomerBalance(null));
    }

    // todo: add tests to achieve 100% code coverage for class under test
}
