package com.nachiketpatel;
import java.util.Scanner;

public class evenodd
{
    public static void main(String[]args)
    {
        int n=10;
        Scanner in = new Scanner(System.in);
        System.out.println("ODD NUMBERS FROM 1 TO "+n+" are : ");
        for (int i=1; i<=n; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i++);
            }

        }
        System.out.println("EVEN NUMBERS FROM 1 TO "+n+" are : ");
        for (int i=1; i<=n; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i++);
            }

        }
    }
}
