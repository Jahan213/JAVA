

package com.mycompany.circlearea;

import java.util.Scanner;
public class CircleArea {

    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter radius of circle : ");
        radius = input.nextDouble();
        
        area = 3.1416*radius*radius;
        System.out.println("The area of" +area);
    }
}
