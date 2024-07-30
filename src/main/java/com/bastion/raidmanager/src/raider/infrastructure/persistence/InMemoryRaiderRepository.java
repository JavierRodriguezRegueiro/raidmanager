package com.bastion.raidmanager.src.raider.infrastructure.persistence;

import com.bastion.raidmanager.src.raider.domain.Raider;
import com.bastion.raidmanager.src.raider.domain.RaiderRepository;
import com.bastion.raidmanager.src.shared.Id;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class InMemoryRaiderRepository implements RaiderRepository {
    private ArrayList<Raider> raiders = new ArrayList<>();
    @Override
    public void save(Raider raider) {
        raiders.add(raider);
    }

    @Override
    public Raider findById(Id id) {
        return raiders.stream().filter(raider -> raider.id().equals(id)).findFirst().orElse(null);
    }
}
