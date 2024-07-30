package com.bastion.raidmanager.src.character.infrastructure.persistence;

import com.bastion.raidmanager.src.character.domain.Character;
import com.bastion.raidmanager.src.character.domain.CharacterRepository;
import com.bastion.raidmanager.src.shared.Id;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class InMemoryCharacterRepository implements CharacterRepository {
    private ArrayList<Character> characters = new ArrayList<>();
    @Override
    public void save(Character character) {
        characters.add(character);
    }

    @Override
    public Character findById(Id id) {
        return characters.stream().filter(character -> character.id().equals(id)).findFirst().orElse(null);
    }
}
