package com.example.hibernate;

public class Student {
    private String Sname;
    private int Sid;
    private int Sage;

    public String getSname() {
        return Sname;
    }

    public int getSid() {
        return Sid;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sname='" + Sname + '\'' +
                ", Sid=" + Sid +
                ", Sage=" + Sage +
                '}';
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public void setSname(String sname) {
        Sname = sname;
    }
}
