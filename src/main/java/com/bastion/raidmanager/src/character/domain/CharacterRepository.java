package com.bastion.raidmanager.src.character.domain;

import com.bastion.raidmanager.src.shared.Id;

public interface CharacterRepository {
    void save(Character character);
    Character findById(Id id);
}
