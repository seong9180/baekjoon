package IO;

import java.util.Scanner;

public class P2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("*");
            }
            for(int j = 1 ; j <= 2*(i + 1); j++){
                System.out.print(" ");
            }
            for (int j = i; j < n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
