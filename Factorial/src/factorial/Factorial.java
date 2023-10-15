package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        for (int i = num; i >= 1; i--) {

            fact = fact * i;

            System.out.println("Enter the factorial value = " + fact);

        }
        System.out.println(fact);
    }
}
