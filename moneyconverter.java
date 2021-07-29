package com.nachiketpatel;
import java.util.Scanner;


public class moneyconverter {

    public static void main(String[] args) {

        double a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Currency to convert Rupees to Dollar:");
        a=in.nextInt();
        System.out.println("Enter Dollar Rate: ");
        b=in.nextInt();

        System.out.print("INR TO DOLLAR :$");
        System.out.println(a/b);
    }
}
