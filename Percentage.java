package com.nachiketpatel;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
       double a,b,c,d,e,f,g,h=100,i=600,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to percentage converter");
        System.out.println("Marks Of Maths:");
        a=in.nextInt();
        System.out.println("Marks Of Science");
        b=in.nextInt();
        System.out.println("Marks Of Gujarati");
        c=in.nextInt();
        System.out.println("Marks Of Hindi");
        d=in.nextInt();
        System.out.println("Marks OF English");
        e=in.nextInt();
        System.out.println("Marks Of Social Science");
        f=in.nextInt();
        g=a+b+c+d+e+f;
        j=g*h/i;
        System.out.println("Percentage of Total Marks is: ");
        System.out.println(j);
    }
}
