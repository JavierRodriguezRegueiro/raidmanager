package com.bastion.raidmanager.src.item.domain;

import com.bastion.raidmanager.src.shared.Id;

import java.util.List;

// TODO: Create value objects.
public record Item(Id id, String name, Slot slot, String material, List<Statistic> statistics, List<Class> availableTo,
                   String description, Raid raid) {

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
                ", raid='" + raid + '\'' +
                '}';
    }
}
