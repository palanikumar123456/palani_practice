package com.palanisoft.core;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int table_num=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the multiplication table number you want to display: ");
        table_num = scanner.nextInt();

        for(int i=1; i <=10; i++) {
            System.out.println("\t" + table_num + "  *  " + i + "  =  " + table_num*i);
        }
    }
}