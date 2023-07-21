package Practice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator {
    public static void main(String[] args) {
//        try {
//        File file = new File("\\Users\\Naveen Bhandariwar\\Desktop\\Demo1.txt");
//        if (!file.exists()) {
//                file.createNewFile();
//            }
//            PrintWriter pw = new PrintWriter(file);
//        pw.println("My name is naveen bhandari, i am from sironcha..!");
//        pw.println("442504");
//        pw.close();
//            System.out.println("Done!");
//        } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

        int[] arr = {2, 4, 7, 4, 3, 6, 4};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    if ((j + 1) % 2 == 0 ) {
                        int num=arr[j]-i;
                        if(num%2==0)
                        System.out.print((char)(num+65)+" ");
                        else
                            System.out.print((char)(num+97)+" ");
                    } else {
                        System.out.print("* ");
                    }

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
           // ch++;
        }

    }
}
