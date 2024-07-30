package com.bastion.raidmanager.src.character.domain;

import com.bastion.raidmanager.src.item.domain.Class;
import com.bastion.raidmanager.src.shared.Id;

public record Character(Id id, Id raiderId, String name, Class className, Role role, boolean active) {
}
