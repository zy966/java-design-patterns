package com.zy.patterns.factory;

public class IDCard extends Product {

    private String owner;

    private Integer serial;

    IDCard(String owner, Integer serial) {
        System.out.println("制作" + owner + " (" + serial + ") 的ID卡");
        this.owner = owner;
        this.serial = serial;
    }

    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    protected void use() {
        System.out.println("使用" + owner + " (" + serial + ") 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getSerial() {
        return serial;
    }
}
