package com.nachiketpatel;
import java.util.Locale;
import java.util.Scanner;
public class consonants {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int vowelCount=0;
        int consonantsCount=0;
        String Sentence;
        System.out.println("Enter Sentence : ");
        Sentence=in.nextLine();
        Sentence=Sentence.toLowerCase();
        for(int i=0;i<Sentence.length();i++)
        {
            if(Sentence.charAt(i)=='a'||Sentence.charAt(i)=='e'||Sentence.charAt(i)=='i'
                    ||Sentence.charAt(i)=='o'||Sentence.charAt(i)=='u')
            {
                vowelCount++;
            }
            else if (Sentence.charAt(i)>='a'&& Sentence.charAt(i)<='z')
            {
                consonantsCount++;
            }
        }
        System.out.println("Number of Vowels is : "+vowelCount+"");
        System.out.println("Number of Consonants is : "+consonantsCount+"");

    }
}
