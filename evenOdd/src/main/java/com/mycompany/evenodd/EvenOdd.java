
package com.mycompany.evenodd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer value = ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }
    }
}
