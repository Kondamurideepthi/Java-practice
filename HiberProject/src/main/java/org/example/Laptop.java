package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private int ram;
    private String model;
    private String brand;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
