

package com.mycompany.statementif;
import java.util.Scanner;
public class Statementif {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any integer value ");
        num = input.nextInt();
        if(num>0){
        
        System.out.println("Condition true *");
        
        }
        else{
         System.out.println("Condition false #");
        }
    }
}
