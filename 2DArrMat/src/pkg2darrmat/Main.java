
package pkg2darrmat;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       int[][] a=new int[2][3];
       int[][] b=new int[2][3];
         System.out.println("Enter the value of A : ");
         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.printf("a[%d][%d]", i,j);
                 a[i][j]=input.nextInt();
           
                 
             }
         }
             System.out.println("A = ");
             for (int i = 0; i < 2; i++) {
             for ( int j = 0; j < 3; j++) {
           
                 System.out.print("\t"+a[i][j]);
                 
             }
                 System.out.println();
             } System.out.println("Enter the value of B: ");
         for (int  i = 0; i < 2; i++) {
             for (int j = 0; j < 3; j++) {
                     System.out.printf("b[%d][%d]", i,j);
                 b[i][j]=input.nextInt();
              
                 
             }
         }
             System.out.print("B = ");
             for ( int i = 0; i < 2; i++) {
             for ( int j = 0; j < 3; j++) {
           
                 System.out.print("\t"+b[i][j]);
                 
             }
                 System.out.println();
             }
             System.out.print("A+B = ");
             for ( int i = 0; i < 2; i++) {
             for ( int j = 0; j < 3; j++) {
           
                 System.out.print("\t"+(a[i][j]+b[i][j]));
                 
             }
                 System.out.println();
        }
    }
} 

