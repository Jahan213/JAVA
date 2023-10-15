

package com.mycompany.ladderstatement;


import java.util.Scanner;
public class LadderStatement {
    public static void main(String[] args){
        
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer number = ");
        num = input.nextInt();
        if(num>0)
        {
            System.out.println("The number is Positive (+)");
        }
        else if(num<0)
        {
            System.out.println("The number is Negative (-)");
        }
        else{
            System.out.println("The number is Zero (0)");
        }
        
        
    }
    
}

