package counting_vowel;

import java.util.Scanner;

public class Counting_Vowel {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String (Small letter):");
        String a = s.nextLine();

        System.out.println("Tolat vowel found :" + count(a));
    }
    static double count(String a) {
        int i, num = 0;
        char letter;

        for (i = 0; i < a.length(); i++) {
            letter = a.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u' || letter == 'i') {
                num++;
            }
        }
        return num;
    }
}
