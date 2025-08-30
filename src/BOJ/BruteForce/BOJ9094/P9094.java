/*
    BOJ 9094 수학적 호기심
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-21
*/

package BOJ.BruteForce.BOJ9094;

import java.util.Scanner;

public class P9094 {
    public static boolean isValid(int a, int b) {
        if (a <= b) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //testcase


        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int answer = 0;

            for (int a = 1; a < n; a++) {
                for (int b = 1; b < n; b++) {
                    if (!isValid(a, b)) continue;
                    int cond1 = a*a + b*b + m;
                    int cond2 = a*b;

                    if (cond1 % cond2 == 0) { //나눗셈의 결과가 정수이기 위해서 : 나머지가 0이여야 함.
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }


    }
}