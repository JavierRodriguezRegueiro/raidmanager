package com.bastion.raidmanager.src.biscollection.domain;

import com.bastion.raidmanager.src.shared.Id;

public interface BISCollectionRepository {
    void save(BISCollection bisCollection);
    BISCollection findById(Id id);
}
