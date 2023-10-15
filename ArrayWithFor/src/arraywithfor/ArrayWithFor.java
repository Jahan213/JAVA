package arraywithfor;

import java.util.Scanner;

public class ArrayWithFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.println("Please enter numbers : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
          System.out.println(num[i]);
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
          
            System.out.println("SUM = " + sum);

        }

        System.out.println(" Total SUM = " + sum);
        System.out.println(" Average = " + sum / num.length);

        double max = num[0];
        double min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];

            }

            if (min > num[i]) {
                min = num[i];

            }

        }
        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);

    }

}
