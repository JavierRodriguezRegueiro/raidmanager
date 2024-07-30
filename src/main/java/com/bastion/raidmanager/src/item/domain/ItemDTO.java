package com.bastion.raidmanager.src.item.domain;

import com.bastion.raidmanager.src.shared.Id;

import java.util.List;

public class ItemDTO {
    private Id id;
    private String name;
    private String slot;
    private String material;
    private List<StatisticDTO> statistics;
    private List<String> availableTo;
    private String description;
    private String raid;

    public ItemDTO(Id id, String name, String slot, String material, List<StatisticDTO> statistics, List<String> availableTo, String description, String raid) {
        this.id = id;
        this.name = name;
        this.slot = slot;
        this.material = material;
        this.statistics = statistics;
        this.availableTo = availableTo;
        this.description = description;
        this.raid = raid;
    }

    public Id getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlot() {
        return slot;
    }

    public String getMaterial() {
        return material;
    }

    public List<StatisticDTO> getStatistics() {
        return statistics;
    }

    public List<String> getAvailableTo() {
        return availableTo;
    }

    public String getDescription() {
        return description;
    }

    public String getRaid() {
        return raid;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setStatistics(List<StatisticDTO> statistics) {
        this.statistics = statistics;
    }

    public void setAvailableTo(List<String> availableTo) {
        this.availableTo = availableTo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }
}
