package IO;

import java.util.Scanner;

public class P1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] fullMonth = new int[12];

        for(int i = 0; i < 12; i++){
            int a = i + 1;
            if (a <= 7 && a % 2 == 0 && a != 2) {
                fullMonth[i] = 30;
            } else if (a <= 7 && a % 2 != 0) {
                fullMonth[i] = 31;
            } else if (a == 2) {
                fullMonth[i] = 28;
            } else if (a % 2 == 0) {
                fullMonth[i] = 31;
            } else {
                fullMonth[i] = 30;
            }
        }
        //test
//        for(int i = 0; i < 12; i++){
//            System.out.println((i+1) + "월 : " + fullMonth[i]);
//        }

        //ex 3.14
        int daySum = 0;
        if (month > 1) {
            for (int i = 0; i < month - 1; i++) {
                daySum += fullMonth[i];
            }
            daySum += day - 1;
        } else {
            daySum += day - 1;
        }

        if (daySum % 7 == 0) {
            System.out.println("MON");
        } else if (daySum % 7 == 1) {
            System.out.println("TUE");
        } else if (daySum % 7 == 2) {
            System.out.println("WED");
        } else if (daySum % 7 == 3) {
            System.out.println("THU");
        } else if (daySum % 7 == 4) {
            System.out.println("FRI");
        } else if (daySum % 7 == 5) {
            System.out.println("SAT");
        } else {
            System.out.println("SUN");
        }
    }
}
