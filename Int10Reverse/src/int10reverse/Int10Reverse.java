
package int10reverse;
import java.util.Scanner;
public class Int10Reverse {
 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ener any integer number : ");
        int n = input.nextInt();
        System.out.println("1 to 10 numbers are : ");
        for (int i = 1; i < n; i++) {
            System.out.print(i+"  ");
            
        }
        System.out.println();
        
        System.out.println("Reverse orser :");
        for (int i = n-1; i >=1; i--) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    
}
