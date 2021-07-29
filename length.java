package com.nachiketpatel;
import java.util.Scanner;

public class length {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String name=new String();
        System.out.println("Enter Word : ");
        name= in.nextLine();
        System.out.println("Word of Length is :"+name.length()+"");
        System.out.println("");
        System.out.println("Your Second half string is :"+name.substring(name.length()/2)+"");

    }
}
