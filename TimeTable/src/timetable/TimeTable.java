
package timetable;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int i,num;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        
        for (i = 1;  i<=10; i++)
           System.out.println(num+" X "+i +" = "+num*i);
            
        
        
        System.out.println();
        
    }
    
}
