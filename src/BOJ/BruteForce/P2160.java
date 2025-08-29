/*
    BOJ 2160 그림 비교
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-27
*/

package BOJ.BruteForce;

import java.util.Scanner;

public class P2160 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        char[][][] arr = new char[N][5][7];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                String line = sc.next();
                for (int k = 0; k < 7; k++) {
                    arr[i][j][k] = line.charAt(k);
                }
            }
        }

        int min = 36; // 최대 35칸, 안전하게 36
        int bestI = -1, bestP = -1;

        for (int i = 0; i < N; i++) {
            for (int p = i + 1; p < N; p++){
                int count = 0;
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 7; k++) {
                        if (arr[i][j][k] != arr[p][j][k]) count++;
                    }
                }
                if (count < min) {
                    min = count;
                    bestI = i;
                    bestP = p;
                }
            }

        }

        // 1-based, 작은 번호 먼저
        int a = Math.min(bestI + 1, bestP + 1);
        int b = Math.max(bestI + 1, bestP + 1);
        System.out.println(a + " " + b);
    }
}