package com.nachiketpatel;
import java.util.Scanner;

public class reversenum {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter Numbers For Reverse: ");
        a=in.nextInt();
        while(a!=0){
            b=a%10;
            c=c*10+b;
            a/=10;
        }
        System.out.println("Reversed Number is "+c+"");
    }
}
