package com.bastion.raidmanager.web.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthGetController {

    @CrossOrigin
    @GetMapping(path = "/health")
    public String run() {
        return "I am Health Get Controller!";
    }
}
