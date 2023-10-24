package com.unitTesting.UnitTestingExample.service;

import com.unitTesting.UnitTestingExample.exception.CustomerDoesNotExistException;
import com.unitTesting.UnitTestingExample.exception.InvalidTransactionException;
import com.unitTesting.UnitTestingExample.model.Customer;

public class BankAccountService {

    public Double getCustomerBalance (Customer customer) {
        if (customer == null) {
            throw new CustomerDoesNotExistException();
        } else {
            return customer.getBalance();
        }
    }

    public Boolean performTransaction (Customer customer, Integer transactionAmount) {
        if (customer == null) {
            throw new CustomerDoesNotExistException();
        }
        if(transactionAmount <= 0) {
            throw new InvalidTransactionException();
        }
        if (customer.getBalance() - transactionAmount >= 0) {
            customer.setBalance(customer.getBalance() - transactionAmount);
            return true;
        }
        return false;
    }

    public Customer createCustomer(Double initialBalance, String customerName, Long accountNumber, String accountType) {
        if (initialBalance < 500) {
            return null;
        } else if (customerName.isBlank()) {
            return null;
        } else if (accountNumber == null) {
            return null;
        } else if (accountType.isBlank()) {
            return null;
        }
        return new Customer(initialBalance, accountNumber, customerName, accountType);
    }

    public Double getAccountInterest(Customer customer) {
        if (customer == null) {
            throw new CustomerDoesNotExistException();
        }
        Double percentage = 0.0;
        switch (customer.getAccountType().toLowerCase()) {
            case ("regular"):
                percentage = 0.01;
                break;
            case ("performance"):
                percentage =  .05;
            case ("vip"):
                percentage = 0.2;
        }
        return percentage;
    }
}
