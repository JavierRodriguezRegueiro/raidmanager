package com.bastion.raidmanager.src.item.domain;

public class StatisticDTO {
    private String attribute;
    private Integer value;

    public StatisticDTO(String attribute, Integer value) {
        this.attribute = attribute;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public Integer getValue() {
        return value;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}