package com.unitTesting.UnitTestingExample.model;

public class Customer {

    private Double balance;
    private Long accountNumber;
    private String customerName;
    private String accountType;

    public Customer(Double balance, Long accountNumber, String customerName, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
