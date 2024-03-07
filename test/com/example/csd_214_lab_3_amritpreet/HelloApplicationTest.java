package com.example.csd_214_lab_3_amritpreet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void annualsalary() {
        HelloApplication x= new HelloApplication();
        assertEquals(x.annualsalary(5000),  60000);
    }
}
