
package matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[][] a=new int[2][3];
         int[][] b=new int[2][3];
         
         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 3; j++) {
                 a[i][j]=input.nextInt();
                 System.out.println("A = ");
                 
             }
             System.out.println("A = ");
             for ( i = 0; i < 2; i++) {
             for ( int j = 0; j < 3; j++) {
           
                 System.out.println(a[i][j]);
                 
             }
             
            
        }
    }
    
}
