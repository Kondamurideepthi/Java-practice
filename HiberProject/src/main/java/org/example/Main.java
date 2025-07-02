
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Laptop lap = new Laptop();
//        lap.setRam(16);
//        lap.setBrand("java");
//        lap.setModel("asus");
//
//        Alien a1 = new Alien();
//        a1.setAid(123);
//        a1.setAname("Alien");
//        a1.setTech("java Dev");
//        a1.setLaptop(lap);



//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//                 session.persist(a1);

//        transaction.commit();
//        Alien a2 = new Alien();
//        a2.get




        Student s1 = new Student();
        s1.setRollNo(106);
        s1.setsName("varshith");
        s1.setsAge(45);
       Student s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();


      Session session = sf.openSession();
         s2 = session.get(Student.class,105);

         session.remove(s2);

//         Transaction transaction = session.beginTransaction();
////         session.merge(s1);
//
//         transaction.commit();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
//        System.out.print(s1);

       System.out.print(s2);
    }

}