/*
    BOJ 4690 완전 세제곱
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-25
*/

package BruteForce;

import java.util.Scanner;

public class P4690 {
    public static void main(String[] args) {
        for (int a = 4; a <= 100; a++) {
            for (int b = 2; b < a; b++) {
                for (int c = b; c < a; c++) {
                    for (int d = c; d < a; d++) {
                        if (isValid(a, b, c, d)) {
                            System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
                        }
                    }
                }
            }
        }
    }

    static boolean isValid(int a, int b, int c, int d) {
        if (((a * a * a) == (b * b * b) + (c * c * c) + (d * d * d))) {
            return true;
        }
        return false;
    }
}