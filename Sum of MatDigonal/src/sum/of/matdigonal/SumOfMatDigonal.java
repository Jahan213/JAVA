
package sum.of.matdigonal;

import java.util.Scanner;
public class SumOfMatDigonal {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
          int Digonal=0;
           int lowerTriangle=0;
            int upperTriangle =0;       
        int[][] A = new int[3][3];
        System.out.println("Enter array elements : ");
        for ( int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
                                                        
            System.out.println();                        
        if(row ==  col)
        {
            Digonal = Digonal+A[row][col];
            System.out.println("Digonal = "+A[row][col]);
        }
        if(row<col)
        {
             lowerTriangle =  lowerTriangle+A[row][col];
              System.out.println("lowerTriangle = "+A[row][col]);
        }
        if(row>col){
            upperTriangle =  upperTriangle+A[row][col];
            System.out.println("upperTriangle = "+A[row][col]);
        }
               
    }
        }
         System.out.println("The value is"+Digonal);  
                System.out.println("The value is"+lowerTriangle);  
                System.out.println("The value is"+upperTriangle);  
       
}
}
