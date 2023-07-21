package Practice;


import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
        distinctNum();
        concateString();
        manipulateString();
    }


    public static void distinctNum() {

        int[] arr = {2, 5, 4, 2, 4, 3, 2, 4, 6};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void concateString() {
        String str1 = "NAVEEN";
        String str2 = "BHANDARI";
        System.out.println(str1 + str2);
    }

    public static void manipulateString() {
        String str = "my name is naveen bhandari and i am Gawandi";
        String[] st = str.split(" ");

        for (int i = 0; i < st.length; i++) {
            if (st[i].length() < 3) {
                st[i] = "";
            } else {
                if (i % 2 == 0) {
                    st[i] = st[i].toLowerCase();
                } else {
                    st[i] = st[i].toUpperCase();
                }
            }
            System.out.print(st[i] + " ");
        }
    }
}





