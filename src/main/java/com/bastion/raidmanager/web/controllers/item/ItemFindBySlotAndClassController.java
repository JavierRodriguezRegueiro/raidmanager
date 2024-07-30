package com.bastion.raidmanager.web.controllers.item;

import com.bastion.raidmanager.src.item.application.ItemFindBySlotAndClass;
import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.item.domain.ItemDTO;
import com.bastion.raidmanager.src.item.domain.StatisticDTO;
import com.bastion.raidmanager.src.item.domain.Slot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
public class ItemFindBySlotAndClassController {
    private final ItemFindBySlotAndClass itemFindBySlotAndClass;

    @Autowired
    public ItemFindBySlotAndClassController(ItemFindBySlotAndClass itemFindBySlotAndClass) {
        this.itemFindBySlotAndClass = itemFindBySlotAndClass;
    }

    @GetMapping("/items/available")
    public ResponseEntity<ArrayList<ItemDTO>> findItemBySlotAndClass(@RequestParam String slot, @RequestParam String className) {
        return ResponseEntity.ok().body((ArrayList<ItemDTO>) itemFindBySlotAndClass.findBySlotAndClass(Slot.valueOf(slot), Class.valueOf(className)).stream().map(item -> {
            return new ItemDTO(item.id(), item.name(), item.slot().toString(), item.material(), item.statistics().stream().map(statistic -> new StatisticDTO(statistic.getAttribute().toString(), statistic.getValue())).collect(Collectors.toList()), item.availableTo().stream().map(Class::toString).collect(Collectors.toList()), item.description());
        }).collect(Collectors.toList()));
    }
}
