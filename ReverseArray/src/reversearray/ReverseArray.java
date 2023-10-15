package reversearray;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int temp = 0;
        System.out.println("Enter number of element :");
        n = input.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted in Ascending order : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Reverse order : ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}
