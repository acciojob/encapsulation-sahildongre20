package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        //java: name has private access in com.driver.RWOnly
       // rwOnly.name="Abc";

        rwOnly.setName("Abc");
        rwOnly.getName();



    }
}