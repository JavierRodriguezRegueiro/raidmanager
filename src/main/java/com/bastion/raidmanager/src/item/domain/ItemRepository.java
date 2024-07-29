package com.bastion.raidmanager.src.item.domain;

import java.util.List;

public interface ItemRepository {
    void save(Item item);
    List<Item> findAll();
    List<Item> findBySlotAndClass(Slot slot, Class availableClass);
}
