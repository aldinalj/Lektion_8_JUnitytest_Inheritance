package com.Aldina.test;

import com.Aldina.unitTestInheritance.Student;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

// This is our test class
class StudentTest {


    @Test
    public void myTest() {

        Student benny = new Student("Benny", 15, true);
        Student frida = null;

        assertEquals(benny.name, "Benny");
        assertNotNull(benny);
    }

}