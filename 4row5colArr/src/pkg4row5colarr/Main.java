
package pkg4row5colarr;
//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int[][] A = new int[4][5];
        int k =0;
        System.out.println("Entyer array elements : ");
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <5; col++) {
               // A[row][col] = input.nextInt();
                  A[row][col] =k;
                  k++;
            }
        }
        System.out.println("A = ");
        for ( int row = 0; row <4; row++) {
            for (int col = 0; col <5; col++) {
                System.out.print("  "+A[row][col]);
                  
            }
            System.out.println();
        }
    }
    
}
