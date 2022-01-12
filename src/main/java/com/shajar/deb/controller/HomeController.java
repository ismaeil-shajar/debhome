package com.shajar.deb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getHomeWelcome(){
        return "Welcome Home Debian";
    }
}
