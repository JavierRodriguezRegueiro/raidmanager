package com.bastion.raidmanager.src.item.infrastructure.persistence;

import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.item.domain.Item;
import com.bastion.raidmanager.src.item.domain.ItemRepository;
import com.bastion.raidmanager.src.item.domain.Slot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryItemRepository implements ItemRepository {
    private ArrayList<Item> items = new ArrayList<>();
    @Override
    public void save(Item item) {
        items.add(item);
        System.out.println(item);
        System.out.println(items);
    }

    @Override
    public List<Item> findAll() {
        return items;
    }

    @Override
    public List<Item> findBySlotAndClass(Slot slot, Class availableClass) {
        System.out.println(slot.toString());
        System.out.println(availableClass.toString());
        return items.stream().filter(item -> item.getSlot().equals(slot) && item.getAvailableTo().stream().anyMatch(availableClassFromItem -> availableClassFromItem.equals(availableClass))).collect(Collectors.toList());
    }
}
