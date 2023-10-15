
package primenumber;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        int m,n,count=0,totalPrime=0;
        System.out.println("Enter first integer : ");
        m = input.nextInt();
        System.out.println("Enter last integer : ");
        n = input.nextInt();
        
        for (int i = m; i <=n; i++) {
            for (int j = 2; j <=i-1; j++) {
                if(i%j==0)
                {
                    count++;
                    break;
                }
     
            }
             if(count==0)
             {
                 System.out.println("The number is Prime : "+i);
                 totalPrime++;
             }
             count=0;
             /*else{
                 System.out.println("Not Prime");
             }*/
            }
        System.out.println("Total Prime number is : "+totalPrime);
        }
            
        }
        
       /* for (i =2; i < num; i++) {             ///one number prime check
            if (num%i==0) {
                count++;
                break;             
            }   
        }
            if(count==0){
                System.out.println("This is prime number : "+num);
            }
            else {
                System.out.println("NOT PRIME");
            }
                
        }
            
    }*/
    

