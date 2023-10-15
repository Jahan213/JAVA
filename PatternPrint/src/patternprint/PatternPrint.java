
package patternprint;
import java.util.Scanner;
public class PatternPrint {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter how many line : ");
       int n = input.nextInt();
        for (int row= 1; row<=n; row++) {
            for (int col= 1; col<=row; col++) {
                System.out.print("--Mithila--");
                
            }
            System.out.println();
        }
    }
    
}
