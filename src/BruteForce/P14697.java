/*
    BOJ 14697 방 배정하기
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-21
*/

package BruteForce;

import java.util.Scanner;

public class P14697 {
    public static int NUM = 300;
    public static int a;
    public static int b;
    public static int c;
    public static int n;
    public static boolean isValid(int x, int y, int z) {
        if (a * x + b * y + c * z == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt(); //총 인원
        int answer = 0;
        boolean possible = false;
        for (int i = 0; i < NUM; i++) {
            for (int j = 0; j < NUM; j++) {
                for (int k = 0; k < NUM; k++) {
                    if (isValid(i, j, k)) {
                        // 한 조합이라도 가능하다면 true;
                        possible = true;
                    }
                }
            }
        }

        if (possible) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}