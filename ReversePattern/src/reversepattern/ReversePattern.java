
package reversepattern;

import java.util.Scanner;

public class ReversePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter line number : ");
        num = input.nextInt();
        for (int row =num; row >=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
