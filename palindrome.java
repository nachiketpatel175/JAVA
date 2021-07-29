package com.nachiketpatel;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String sentence, reverse = "";
        System.out.println("Enter a Sentence or a Number: ");
        sentence = in.nextLine();

        int length = sentence.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + sentence.charAt(i);
        System.out.println("Reverse Sentence is "+reverse+"");
        System.out.println("");
        if (sentence.equals(reverse))
            System.out.println(""+sentence+" is a palindrome.");
        else
            System.out.println(""+sentence+" isn't a palindrome.");
    }

}
    

