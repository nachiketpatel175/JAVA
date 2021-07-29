package com.nachiketpatel;
import  java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Value of a :");
        a = in.nextInt();
        System.out.println("Enter value of b :");
        b= in.nextInt();
         c=a;
         a=b;
         b=c;
         System.out.println("After Swapping a :"+a+"");
        System.out.println("After Swapping b :"+b+"");

    }
}