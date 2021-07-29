package com.nachiketpatel;
import java.util.Scanner;
public class calculator2 {
    public static void main(String []args) {
        double a,b,c;//a=Num1,b=Num2,c=answer
        char Operator;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter Value of A : ");
        a=in.nextInt();
        System.out.println("Enter Value of B : ");
        b=in.nextInt();
        System.out.println("Which Operator do you want to use '+,-,*,/,%' ?");
        Operator= in.next().charAt(0);
        switch (Operator) {
            case'+':c=a+b;
                System.out.println("Your answer is "+c+"");
            break;
            case'-':c=a-b;
                System.out.println("Your answer is "+c+"");
            break;
            case'*':c=a*b;
                System.out.println("Your answer is "+c+"");
            break;
            case'/':c=a/b;
                System.out.println("Your answer is "+c+"");
            break;
            case'%':c=a%b;
                System.out.println("Your answer is "+c+"");
            break; } }}
