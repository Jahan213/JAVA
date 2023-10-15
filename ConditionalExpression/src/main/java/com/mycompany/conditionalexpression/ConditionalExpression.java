
package com.mycompany.conditionalexpression;

import java.util.Scanner;

public class ConditionalExpression {

    public static void main(String[] args) {
        int num1, num2, lerge;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number : ");

        num1 = input.nextInt();
        num2 = input.nextInt();

        lerge = (num1 > num2) ? num1 : num2;
        System.out.println("Lerge number is : " + lerge);

    }
}
