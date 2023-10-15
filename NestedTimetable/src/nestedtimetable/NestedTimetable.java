
package nestedtimetable;

import java.util.Scanner;

public class NestedTimetable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter First number : ");
        m = input.nextInt();
        System.out.println("Enter Last number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " X " + j + " = " + i * j);

            }
            System.out.println();
        }

    }

}
    
    

