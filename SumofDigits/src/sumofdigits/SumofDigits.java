
package sumofdigits;
import java.util.Scanner;
public class SumofDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp,sum=0;
        System.out.println("Enter any digits : ");
        num = input.nextInt();
       temp=num;
       while(temp!=0)
       {
           r = temp%10;
           sum = sum+r;
           temp =temp/10;
           System.out.println(sum);
       }
        System.out.println("Sum is : "+sum );
     
    }
    
}
