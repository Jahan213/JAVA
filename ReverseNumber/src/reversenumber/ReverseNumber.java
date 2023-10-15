package reversenumber;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,num,temp,sum=0;
        System.out.println("Enter numbers : ");
        num = input.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
            System.out.println("Reverse number is : "+sum);
        }
        System.out.println("Total Reverse number is : "+sum);
    }
    
}
