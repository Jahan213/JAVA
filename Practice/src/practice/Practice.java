

package practice;

import java.util.Scanner;


public class Practice {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag=0;
        while(flag==1){
        int num1,num2;
        System.out.println("Enter the first number : ");
        num1 = input.nextInt();
        System.out.println("Enter the first number : ");
        num2 = input.nextInt();
            System.out.println("Enter Operation : ");
            System.out.println("1.Addition\n2.Substraction\n3.Multiplay\n4.Division\n5.Modul\n");
        
        
        
      int choice = input.nextInt();
         switch (choice){
            case 1:
                System.out.println("Addidtion : "+num1+"+"+num2+"=" +(num1+num2));
                break;
           case 2:
                System.out.println("Substraction : " +num1+"-"+num2 + "=" +(num1+num2));
                break;
           case 3:
                System.out.println("Multiplycation : "+num1+"x"+num2+"="+(num1+num2));
                break;
           case 4:
                System.out.println("Division : "+num1+"/"+num2+"=" +(num1+num2));
                break;
           default:
               System.out.println("Invalid choice ---------");
                break;
        }
            System.out.println("Do you want to continue(0/1)");
            flag=input.nextInt();
    }
    
}
}
