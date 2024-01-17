package com.durgasoft.core;

interface I {
    public static void m1(){
        System.out.println("m1-I");
    }
    public static void m2() {
        System.out.println("m2-I");
    }
}

class A implements I {

}

public class Test3 {
    public static void main(String[] args) {
        I.m1();
        I.m2();
        System.out.println("======================================");

        I i = new A();
        i.m1();
        i.m2();
        A.m1();
        A.m2();
        System.out.println(i.hashCode());

    }
}