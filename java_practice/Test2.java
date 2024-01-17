package com.durgasoft.core;

interface I {
    public static void m1(){
        System.out.println("m1-I");
    }
    public static void m2() {
        System.out.println("m2-I");
    }
}

public class Test2 {
    public static void main(String[] args) {
        I.m1();
        I.m2();
    }
}