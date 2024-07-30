package com.bastion.raidmanager.src.raider.application;

import com.bastion.raidmanager.src.raider.domain.Raider;
import com.bastion.raidmanager.src.raider.domain.RaiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RaiderCreator {
    private RaiderRepository raiderRepository;

    @Autowired
    public RaiderCreator(RaiderRepository raiderRepository) {
        this.raiderRepository = raiderRepository;
    }

    void create(Raider raider) {
        raiderRepository.save(raider);
    }
}
