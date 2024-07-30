package com.bastion.raidmanager.src.item.application;

import com.bastion.raidmanager.src.item.domain.*;
import com.bastion.raidmanager.src.item.domain.Class;
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

    // TODO: Refactor to take the current raid
    public void create(Id id, String name, Slot slot, String material, List<Statistic> statistics, List<Class> availableTo, String description, Raid raid){
        itemRepository.save(new Item(id, name, slot, material, statistics, availableTo, description, raid));
    }
}
