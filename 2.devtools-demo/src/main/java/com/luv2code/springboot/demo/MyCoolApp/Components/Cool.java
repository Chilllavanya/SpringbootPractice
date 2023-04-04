package com.luv2code.springboot.demo.MyCoolApp.Components;

import org.springframework.stereotype.Component;

@Component
public class Cool implements Interface {

    @Override
    public String laugh() {
        return "Wow! Cool laugh.";
    }
    
}
