package org.example.SpringApp.Repo;

import org.example.SpringApp.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceRepository {
    public void save(Laptop lap)
    {
        System.out.print("Data saved in DataBase.......");
    }
}
