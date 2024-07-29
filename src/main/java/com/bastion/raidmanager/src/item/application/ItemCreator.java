package com.bastion.raidmanager.src.item.application;

import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.item.domain.Item;
import com.bastion.raidmanager.src.item.domain.ItemRepository;
import com.bastion.raidmanager.src.item.domain.Slot;
import com.bastion.raidmanager.src.item.domain.Statistic;
import com.bastion.raidmanager.src.shared.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemCreator {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemCreator(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void create(Id id, String name, Slot slot, String material, List<Statistic> statistics, List<Class> availableTo, String description){
        itemRepository.save(new Item(id, name, slot, material, statistics, availableTo, description));
    }
}
