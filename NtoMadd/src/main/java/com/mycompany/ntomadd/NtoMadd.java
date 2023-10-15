
package com.mycompany.ntomadd;
import java.util.Scanner;
public class NtoMadd {

    public static void main(String[] args) {
        int i,m,n,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        m = input.nextInt();
        System.out.println("Enter the last number : ");
        n = input.nextInt();
        
        for ( i = m; i < n ; i++) {
            if(i%2==0)
            {
            
            sum = sum+i;
            
           System.out.println(" M to N even numbers are : \n" +i ); 
           
           
           System.out.println("Sum of M to N even numbers :\n"   +sum); 
        }
            
            
            
            if(i%2!=0)
            {
                sum = sum+i;
            
           System.out.println(" M to N ODD numbers are : \n" +i ); 
           
           
           System.out.println("Sum of M to N ODD numbers : \n"   +sum); 
            }
        }
        
    }
}
