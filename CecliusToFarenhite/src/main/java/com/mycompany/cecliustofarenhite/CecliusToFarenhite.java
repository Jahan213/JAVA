
package com.mycompany.cecliustofarenhite;
import java.util.Scanner;
public class CecliusToFarenhite {
    

    public static void main(String[] args) {
        double cels, faren;
        
        Scanner input = new Scanner(System.in);
         
        System.out.println("Celcius : ");
        cels = input.nextDouble();
        
        faren = 1.8*(cels+32);
        System.out.println("Farenhite : " +faren);
  
        
        
  
    }
}
