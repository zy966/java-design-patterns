package com.zy.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String name) {
        Product proto = showcase.get(name);
        return proto.createClone();
    }

}
