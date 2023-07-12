package Practice;

import java.util.HashSet;
import java.util.Scanner;

public class OddEvenOccurence {
    public static void count(int[] arr, int a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (set.contains(arr[i]) == false) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                set.add(arr[i]);
               // System.out.println(arr[i]+" is"+count+" times.");
                if (a % 2 == count % 2)
                    System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 4, 3, 3, 4, 2};
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for odd occuring numbers in array.");
        System.out.println("Enter 2 for even occuring numbers in array.");
        int input = sc.nextInt();
        count(arr, input);

    }
}
