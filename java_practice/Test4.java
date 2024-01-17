package com.durgasoft.core;

class A {
    void m1(){
        System.out.println("m1-A");
    }
}

class B{
    void m1(){
        System.out.println("m1-B");
    }
}

// multiple class inheritance is not supported in java
class C extends A, B {
    void m3() {
        m1();
    }
}

public class Test4{
    public static void main(String[] args) {
        C c = new C();
        c.m3();
    }
}