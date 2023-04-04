package com.luv2code.springboot.demo.MyCoolApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.demo.MyCoolApp.Components.Interface;

@RestController
public class FunRestController {
    private Interface interf;

    @Autowired
    public FunRestController(@Qualifier("normal") Interface inte) {
        this.interf = inte;
    }

    @GetMapping("/")
    public String getName() {
        return "Hello World";
    }

    @GetMapping("/laugh")
    public String getLaugh() {
        return interf.laugh();
    }
}
