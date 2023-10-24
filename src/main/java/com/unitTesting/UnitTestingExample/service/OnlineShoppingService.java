package com.unitTesting.UnitTestingExample.service;

import com.unitTesting.UnitTestingExample.exception.InvalidTransactionException;
import com.unitTesting.UnitTestingExample.model.Item;
import java.math.BigDecimal;

public class OnlineShoppingService {

    private final InventoryService inventoryService = new InventoryService();
    private final PaymentService paymentService = new PaymentService();

    public BigDecimal getItemPrice(String itemName) {
        Item item = inventoryService.getItemByName(itemName);
        if (item == null) {
            throw new IllegalStateException();
        }

       return item.getPrice();
    }

    public Item checkout (String itemName) {
        Item item = inventoryService.getItemByName(itemName);
        if (item.getQuantity() > 0) {
            boolean isTransactionSuccessful = paymentService.processPayment();
            if (isTransactionSuccessful) {
                item.setQuantity(item.getQuantity() - 1);
                return item;
            }
            throw new InvalidTransactionException();
        }
        throw new RuntimeException("Not enough to sell!");
    }
}
