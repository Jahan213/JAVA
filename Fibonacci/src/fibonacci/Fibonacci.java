package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fibo = 0, first, second;

        System.out.println("Enter how many number : ");
        num = input.nextInt();
        first = 0;
        second = 1;
        System.out.println(first + "  " + second);
        for (int i = 3; i <= num; i++) {
            fibo = first + second;
            System.out.println(i+"Fibonacci series is : " + fibo);
            first = second;
            second = fibo;

        }
        fibo = fibo++;
        System.out.println("Total Fibonacci series is : " + fibo);
    }

}
