package com.nachiketpatel;
import java.util.Scanner;

public class factorial
{
    public static void main(String[]args)
    {
        int i,b=1;
        int a;  //a=value //
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Value of Factorial : ");
        a=in.nextInt();
        for (i=1;i<=a;i++)
        {
           b=b*i;
        }
        System.out.print("Factorial Of "+a+" is :");
        System.out.println(b);
    }
}
