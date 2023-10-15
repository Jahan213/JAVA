
package palindromenumber;
import java.util.Scanner;
public class PalindromeNUmber {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num,r,temp,sum=0;
        System.out.println("Enter any numbers : ");
        num = input.nextInt();
        temp=num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
            System.out.println("reverse numbers are : "+sum);
        }
        if(num==sum)
        {
            System.out.println("The number is palindrom : "+sum);
        }
        else{
            
            System.out.println("Not Palindrom");
    }
    }
    
}
