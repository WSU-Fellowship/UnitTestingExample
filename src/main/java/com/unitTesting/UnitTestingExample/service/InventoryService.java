package com.unitTesting.UnitTestingExample.service;

import com.unitTesting.UnitTestingExample.model.Item;
import java.math.BigDecimal;

public class InventoryService {

    public Double getPriceOfItem(String itemName) {
        return 100.00;
    }

    public boolean doesItemExist(String itemName) {
        return true;
    }

    public Integer getItemQuantity(String itemName) {
        return 5;
    }

    public Item getItemByName(String itemName) {
        Item item = new Item();
        item.setPrice(BigDecimal.valueOf(100.00));
        item.setName("ItemName");
        return item;
    }
}
