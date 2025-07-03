package com.example.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Lapop laptop;
    public void code()
    {
        laptop.compile();
    }

}

