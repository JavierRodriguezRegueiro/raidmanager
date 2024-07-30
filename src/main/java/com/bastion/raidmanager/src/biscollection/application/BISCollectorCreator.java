package com.bastion.raidmanager.src.biscollection.application;

import com.bastion.raidmanager.src.biscollection.domain.BISCollection;
import com.bastion.raidmanager.src.biscollection.domain.BISCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BISCollectorCreator {
    private BISCollectionRepository bisCollectionRepository;

    @Autowired
    public BISCollectorCreator(BISCollectionRepository bisCollectionRepository) {
        this.bisCollectionRepository = bisCollectionRepository;
    }

    public void create(BISCollection bisCollection) {
        bisCollectionRepository.save(bisCollection);
    }
}
