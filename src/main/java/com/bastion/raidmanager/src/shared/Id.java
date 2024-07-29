package com.bastion.raidmanager.src.shared;

import java.util.UUID;

public class Id {
    private final UUID id;

    public Id(UUID id) {
        this.id = id;
    }

    public static Id fromString(String id) {
        return new Id(UUID.fromString(id));
    }

    public UUID getId() {
        return id;
    }

    public String toString() {
        return id.toString();
    }
}
