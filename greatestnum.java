//FIND GREATEST NUMBER PROGRAM//

package com.nachiketpatel;
import java.util.Scanner;

public class greatestnum
{
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Three Numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        {
            if (a > b && a > c) {
                System.out.println("Greater Value is: " + a + " ");
            }
            if (b>a && b>c)
            {
                System.out.println("Greater Value is: "+b+" ");
            }
            if (c>a && c>b)
            {
                System.out.println("Greater Value is: "+c+" ");
            }
        }
    }
}
