package com.nachiketpatel;
import  java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        double a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("--Welcome to  calculator--");
        System.out.println("Enter Value of a :");
        a=in.nextInt();
        System.out.println("Enter value of b :");
        b=in.nextInt();

        System.out.print("The Addition Of A and B is : ");
        System.out.println(a+b);
        System.out.print("The Subtraction Of A and B is : ");
        System.out.println(a-b);
        System.out.print("The Multiplication Of A and B is :");
        System.out.println(a*b);
        System.out.print("The Division of A and B is :");
        System.out.println(a/b);

    }

}
