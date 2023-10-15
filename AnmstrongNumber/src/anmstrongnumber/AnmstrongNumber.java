
package anmstrongnumber;
import java.util.Scanner;
public class AnmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp,sum=0;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        temp = num;
        
        while(temp!=0)
        {
            r = temp%10;
            sum = sum+r*r*r;
            temp =temp/10;
            System.out.println("Numbers : "+sum);
        }
        if(num==sum)
        {
            System.out.println("Anmstrong number : "+sum);
        }
        else{
            System.out.println("Not Anmstrong");
        }
        
        
    }
    
}
