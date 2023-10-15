
package com.mycompany.series1;

import java.util.Scanner;

public class Series1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, sum = 0;
        System.out.println("Enter any number : ");
        num = input.nextInt();

        for (i = 2; i < num; i = i + 2) {

            System.out.print(i + "  ");

            sum = sum + i;
            System.out.println("The sum of series is : " + sum);

        }
    }
}
