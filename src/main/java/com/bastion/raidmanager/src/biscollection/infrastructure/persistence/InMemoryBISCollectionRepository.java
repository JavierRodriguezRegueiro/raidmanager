package com.bastion.raidmanager.src.biscollection.infrastructure.persistence;

import com.bastion.raidmanager.src.biscollection.domain.BISCollection;
import com.bastion.raidmanager.src.biscollection.domain.BISCollectionRepository;
import com.bastion.raidmanager.src.shared.Id;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

// TODO: Replace dummy memory implementation by a real database :)
@Repository
public class InMemoryBISCollectionRepository implements BISCollectionRepository {
    private ArrayList<BISCollection> bisCollections = new ArrayList<>();
    @Override
    public void save(BISCollection bisCollection) {
        bisCollections.add(bisCollection);
    }

    @Override
    public BISCollection findById(Id id) {
        return bisCollections.stream().filter(bisCollection -> bisCollection.id().equals(id)).findFirst().orElse(null);
    }
}
