package BOJ.DP;

import java.util.Scanner;

public class P10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input n <= 10^6 (int 범위 이내)
        int n = sc.nextInt(); //input
        int[] dp = new int[n + 1];

        // 배열 인덱스 문제 때문에 1 입력시에는 9 출력하고 프로그램 종료
        if (n == 1) {
            System.out.println(9);
            return;
        }
        dp[1] = 9; //길이 1
        dp[2] = 17;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] - 1) * 2;
        }

        System.out.println(dp[n] % 1000000000);
    }
}
