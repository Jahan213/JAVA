

package com.mycompany.celstofaren;
import java.util.Scanner;
public class CelstoFaren {

    public static void main(String[] args) {
        double faren, cels;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Farenhite : ");
        faren = input.nextDouble();
        
        cels = 1.8*(faren-32);
        System.out.println("Celcius : " +cels);
        
    }
}
