package foreachloop;

import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Mithila", "Muna", "Mishpa", "Mridula"};
        System.out.println("Names are : ");
        for (String M : names) {
            System.out.println(M);

        }
        System.out.println();
         System.out.println("Sum of two numbers : " );
        int[] num = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int X : num) {
            sum = sum + X;
            System.out.println(" "+sum);
                   
        }
        System.out.println(sum);
    }

}
