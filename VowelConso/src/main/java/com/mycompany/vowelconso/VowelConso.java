
package com.mycompany.vowelconso;
import java.util.Scanner;
public class VowelConso {

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character : ");
        ch = input.next().charAt(0);
        if(ch == 'a')
        {
            System.out.println("The character is vowel");
        }
        else if(ch=='e' )
        {
            System.out.println("The character is vowel");
        }
        else if(ch=='i' )
        {
            System.out.println("The character is vowel");
        }
        else if(ch=='o')
        {
            System.out.println("The character is vowel");
        }
        else if(ch=='u')
        {
            System.out.println("The character is vowel");
        }
        else
        {
            System.out.println("The character is Consonent ");
        }
    }
}
