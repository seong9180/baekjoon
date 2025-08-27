package DP;

import java.util.Scanner;

public class P1463new {
    //2024.5.2 오후 4시 12분. 청도지 수업 이후 스타벅스 학여울점에서
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input
        int[] dp = new int[n + 1];

        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            // -1 한 경우
            dp[i] = dp[i-1] + 1; //-1 연산 한번 수행했으니 count + 1

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // /2 연산 한번 수행했으니 count + 1
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // /3 연산 한번 수행했으니 count + 1
            }
        }

        System.out.println(dp[n]);

    }
}
