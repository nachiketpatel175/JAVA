package com.nachiketpatel;
import java.util.Scanner;

public class Capitalnum {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int count=0;
        char ch;
        String Sentence;

        System.out.println("Enter a Sentence : ");
        Sentence=in.nextLine();

        if(Sentence.charAt(0)>=65 && Sentence.charAt(0)<=90)
            count++;

        for(int i=1;i<Sentence.length();i++)
        {
            ch = Sentence.charAt(i);
            if((ch>=65 && ch<=90) && (Character.isWhitespace(Sentence.charAt(i-1))))
                count++;
        }

        System.out.println("Words that start with capital letters are : "+count+"");
    }
}


