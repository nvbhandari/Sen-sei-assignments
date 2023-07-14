package Practice;

import java.time.LocalDate;
import java.util.Scanner;

public class YearCalender {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which year calender do you need ?");
            int y = sc.nextInt();
            for (int m = 1; m < 13; m++) {
                monthIterate(y, m);
            }
        }
        public static void monthIterate(int y,int 1998m){
            String[] month = {" ", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
            int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            LocalDate localDate = LocalDate.of(y, m, 1);
            java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            int day = dayOfWeek.getValue();
            System.out.println(y+" - "+month[m]);
            // System.out.println("Day of week in text:" + dayOfWeek.toString());
            if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
                days[2] = 29;
            }
            int d=days[m];
            System.out.println("SUN MON TUE WED THU FRI SAT");
            if (day!=7){
                for(int i=1;i<=day;i++){
                    System.out.print("    ");
                }
            }
            for (int j=1;j<=d;j++) {
                if (j < 10) {
                    System.out.print("0" + j + "  ");
                } else{
                    System.out.print(j + "  ");
                }
                if ((j + day) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("---------------------------");
        }
    }


