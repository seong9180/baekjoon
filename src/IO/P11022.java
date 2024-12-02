package IO;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt(); //testcase
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
