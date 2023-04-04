package com.luv2code.springboot.demo.MyCoolApp.Components;

import org.springframework.stereotype.Component;

@Component
public class Normal implements Interface {

    @Override
    public String laugh() {
        return " Its for clarity.";
    }
    
}
