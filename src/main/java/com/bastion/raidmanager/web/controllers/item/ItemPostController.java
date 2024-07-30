package com.bastion.raidmanager.web.controllers.item;

import com.bastion.raidmanager.src.item.application.ItemCreator;
import com.bastion.raidmanager.src.item.domain.*;
import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.shared.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
public class ItemPostController {
    private final ItemCreator itemCreator;

    @Autowired
    public ItemPostController(ItemCreator itemCreator) {
        this.itemCreator = itemCreator;
    }

    @CrossOrigin
    @PostMapping(path = "/item/{id}")
    public ResponseEntity<String> run (@PathVariable String id, @RequestBody ItemDTO request) {
        try {
            ArrayList<Statistic> statistics = (ArrayList<Statistic>) request.getStatistics().stream().map(statisticDTO -> {
                return new Statistic(Attribute.valueOf(statisticDTO.getAttribute()), statisticDTO.getValue());
            }).collect(Collectors.toList());

            ArrayList<com.bastion.raidmanager.src.item.domain.Class> availableTo = (ArrayList<Class>) request.getAvailableTo().stream().map(string -> {
                return Class.valueOf(string);
            }).collect(Collectors.toList());
            itemCreator.create(Id.fromString(id), request.getName(), Slot.valueOf(request.getSlot()), request.getMaterial(), statistics, availableTo, request.getDescription(), Raid.valueOf(request.getRaid()));
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

