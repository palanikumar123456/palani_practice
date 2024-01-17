package com.durgasoft.core;

interface I1{
    void m1();
}

interface I2{
    void m2();
}

// multiple interface inheritance is supported in java
interface I3 extends I1, I2 {
    void m3();
}

class A implements I3 {
    public void m3(){
        System.out.println("m3-I3 overridden in class A");
    }

    public void m1(){
        System.out.println("m1-I1 overridden in class A");
    }

    public void m2(){
        System.out.println("m2-I1 overridden in class A");
    }
}

public class Test5 {
    public static void main(String[] args) {
        System.out.println("Test5 class executed .....");
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        System.out.println("========================================");

        I3 i = new A();
        i.m1();
        i.m2();
        i.m3();
    }
}