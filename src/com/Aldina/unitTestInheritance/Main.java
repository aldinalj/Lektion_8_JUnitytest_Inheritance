package com.Aldina.unitTestInheritance;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Student benny = new Student("Benny", 5, true);
        School sti = new School("STI", 10);

        sti.introduceStudent(benny);

        System.out.println(benny.toString());

        /*
        String name = "Teresa";
        int age = 15;

        /* for (int i = 0; i < 100; i++) {
            Random r = new Random();
            System.out.println(r.nextInt(7));

        }

        if (age == 16 && name.equals("Teresa")) {
            System.out.println("YOU REALLY ARE TERERSA");
        } */

        }
    }