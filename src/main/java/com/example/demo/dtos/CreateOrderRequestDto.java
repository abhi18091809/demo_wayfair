package com.example.demo.dtos;

import java.math.BigInteger;
import java.util.List;

public class CreateOrderRequestDto {
    List<BigInteger> itemIds;
    BigInteger userId;

    public List<BigInteger> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<BigInteger> itemIds) {
        this.itemIds = itemIds;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
}
