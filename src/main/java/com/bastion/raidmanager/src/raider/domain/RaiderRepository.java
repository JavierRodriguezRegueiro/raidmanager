package com.bastion.raidmanager.src.raider.domain;

import com.bastion.raidmanager.src.shared.Id;

public interface RaiderRepository {
    void save(Raider raider);
    Raider findById(Id id);
}
