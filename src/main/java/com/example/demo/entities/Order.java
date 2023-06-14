package com.example.demo.entities;

import java.math.BigInteger;
import java.util.List;

public class Order {
    List<BigInteger> itemId;
    BigInteger userId;

    public Order(List<BigInteger> itemId, BigInteger userId) {
        this.itemId = itemId;
        this.userId = userId;
    }
}
