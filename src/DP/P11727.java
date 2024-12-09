package DP;

import java.util.Scanner;

public class P11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 1 ~ 1000
        int[] dp = new int[n + 1];

        if (n == 1) {
            System.out.println(1);
            return;
        }

        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}