package com.bastion.raidmanager.src.item.domain;

import com.bastion.raidmanager.src.shared.Id;

import java.util.List;

// TODO: Create value objects.
public class Item {
    private final Id id;
    private final String name;
    private final Slot slot;
    private final String material;
    private final List<Statistic> statistics;
    private final List<Class> availableTo;
    private final String description;

    public Item(Id id, String name, Slot slot, String material, List<Statistic> statistics, List<Class> availableTo, String description) {
        this.id = id;
        this.name = name;
        this.slot = slot;
        this.material = material;
        this.statistics = statistics;
        this.availableTo = availableTo;
        this.description = description;
    }

    public Id getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public List<Statistic> getStatistics() {
        return statistics;
    }

    public String getDescription() {
        return description;
    }

    public Slot getSlot() {
        return slot;
    }

    public List<Class> getAvailableTo() {
        return availableTo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slot=" + slot +
                ", material='" + material + '\'' +
                ", statistics=" + statistics +
                ", availableTo=" + availableTo +
                ", description='" + description + '\'' +
                '}';
    }
}
