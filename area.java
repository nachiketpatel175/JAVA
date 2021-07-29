package com.nachiketpatel;
import java.util.Scanner;

public class area {
    public static void main(String[]args){
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        a=in.nextInt();

        //area of circle is πr^2 where π=3.14//

        b=3.14*a*a;
        System.out.print("Area of Circle is : ");
        System.out.println(b);

    }
}
