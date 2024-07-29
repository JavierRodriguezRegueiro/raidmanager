package com.bastion.raidmanager.src.item.domain;

public class Statistic {
    private final Attribute attribute;
    private final Integer value;

    public Statistic(Attribute attribute, Integer value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public Integer getValue() {
        return value;
    }
}
