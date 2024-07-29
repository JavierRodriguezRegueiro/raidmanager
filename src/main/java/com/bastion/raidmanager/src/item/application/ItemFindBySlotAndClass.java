package com.bastion.raidmanager.src.item.application;

import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.item.domain.ItemRepository;
import com.bastion.raidmanager.src.item.domain.Slot;
import com.bastion.raidmanager.src.item.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemFindBySlotAndClass {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemFindBySlotAndClass(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findBySlotAndClass(Slot slot, Class className) {
        return itemRepository.findBySlotAndClass(slot, className);
    }
}
