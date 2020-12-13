package com.zy.patterns.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    private Map<String, Integer> owner2serial = new HashMap<>();

    private AtomicInteger inc = new AtomicInteger(100);

    @Override
    protected Product createProduct(String owner) {
        Integer serial = inc.getAndIncrement();
        return new IDCard(owner, serial);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        owners.add(card.getOwner());
        owner2serial.put(card.getOwner(), card.getSerial());
    }

    public List<String> getOwners() {
        return owners;
    }

    public Map<String, Integer> getOwner2serial() {
        return owner2serial;
    }
}

