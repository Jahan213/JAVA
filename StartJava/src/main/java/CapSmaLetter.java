import java.util.Scanner;
public class CapSmaLetter {
    public static void main(String[] args){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any letter : ");
        ch = input.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("_______SMALL LETTER_________ ");
                    
        }
        else(ch>='A' && ch<='Z')
        {
            System.out.println("_______CAPITAL LETTER_________ ");
                    
        }
    }
    
}
