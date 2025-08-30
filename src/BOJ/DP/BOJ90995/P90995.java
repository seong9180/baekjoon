package BOJ.DP.BOJ90995;

import java.util.Scanner;

public class P90995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //testcase
        int[] input= new int[t];
        for (int i = 0; i < t; i++) {
            input[i] = sc.nextInt();
        }

        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        //미리 dp 계산
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int j = 0; j < t; j++) {

            if (input[j] <= 2) {
                System.out.println(input[j]);
                continue;
            }
            System.out.println(dp[input[j]]);
        }
        sc.close();
    }
}
