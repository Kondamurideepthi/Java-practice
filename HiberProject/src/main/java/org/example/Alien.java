package org.example;

import jakarta.persistence.*;

@Entity
@Table (name="table_Alien")
public class Alien {
    @Id
    private int aid;
    @Column(name="alien_id")
    private String aname;

    private Laptop laptop;

    @Transient
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", laptop=" + laptop +
                ", tech='" + tech + '\'' +
                '}';
    }
}

