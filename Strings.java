package com.company;

import java.util.Locale;
import java.util.Scanner;

public class string {
    public static void main(String[] args){
//            String name = new String("harry");
//            System.out.print("your name is :");
//            System.out.println(name);

//        int a =5;
//        float b= 40.50f;
//        System.out.println("the value of a %d and value of b is %f",a , b);

        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int a = t.length();
        System.out.println(t);
//        System.out.println(a);
//        String b = t.toLowerCase();
//        System.out.println(b);
//        System.out.println(t.substring(0));
//        System.out.println(t.substring(1,4));
//        System.out.println(t.replace('r','p'));
//        System.out.println(t.startsWith("h"));
//        System.out.println(t.endsWith("y"));
//        System.out.println(t.charAt(2));
//        System.out.println(t.indexOf("y"));
        System.out.println(t.lastIndexOf("ha",3));
//        System.out.println(t.equals("harry"));
        System.out.println(t.equalsIgnoreCase("harry"));



    }
}
