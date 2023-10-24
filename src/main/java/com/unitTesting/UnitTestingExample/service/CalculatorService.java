package com.unitTesting.UnitTestingExample.service;

public class CalculatorService {
    private final ExampleCollaborator collaborator = new ExampleCollaborator();

    public Integer add(Integer a, Integer b) {
        return collaborator.add(a, b);
    }

    public Integer subtract(Integer a, Integer b) {
        return collaborator.subtract(a, b);
    }

    public Integer multiply(Integer a, Integer b) {
        return collaborator.multiply(a, b);
    }

    public Integer divide(Integer a, Integer b) {
        return collaborator.divide(a, b);
    }
}
