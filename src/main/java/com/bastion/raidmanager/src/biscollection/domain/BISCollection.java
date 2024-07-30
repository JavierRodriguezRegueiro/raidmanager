package com.bastion.raidmanager.src.biscollection.domain;

import com.bastion.raidmanager.src.item.domain.Item;
import com.bastion.raidmanager.src.shared.Id;

import java.util.List;

public record BISCollection(Id id, Id characterId, List<Item> items) {
}
