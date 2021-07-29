package com.nachiketpatel;
import java.util.Scanner;
public class primenum {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a,b=0,flag=0;
        int i;
        System.out.println("Enter a Number: ");
        a=in.nextInt();
        b=a/2;
            if(b==0||b==2)
            {
                System.out.println(""+a+" isn't a Prime Number");
            }else{
                for(i=2;i<=b;i++)
                {
                    if(a%i==0){
                        System.out.println(""+a+" isn't a Prime Number");
                        flag=1;
                        break;
                    }
                } }
            if (flag==0)
            {
                System.out.println(""+a+" is a Prime Number");
            } }
}
