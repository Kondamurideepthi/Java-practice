package org.example.SpringApp.service;

import org.example.SpringApp.Repo.ServiceRepository;
import org.example.SpringApp.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLaptop {
    @Autowired
    private ServiceRepository repo;
    public void addLaptop(Laptop lap)
    {
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap)
    {
        return true;

    }

}
