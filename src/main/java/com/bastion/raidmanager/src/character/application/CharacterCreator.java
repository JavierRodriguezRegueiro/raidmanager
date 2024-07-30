package com.bastion.raidmanager.src.character.application;

import com.bastion.raidmanager.src.character.domain.Character;
import com.bastion.raidmanager.src.character.domain.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CharacterCreator {
    private CharacterRepository characterRepository;

    @Autowired
    public CharacterCreator(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

   public void create(Character character) {
        characterRepository.save(character);
    }
}
