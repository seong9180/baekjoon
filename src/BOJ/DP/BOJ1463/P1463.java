package BOJ.DP.BOJ1463;

import java.util.Scanner;

public class P1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input n <= 10^6 (int 범위 이내)
        int n = sc.nextInt(); //input
        int[] dp = new int[n + 1];

        dp[1] = 0; //1에서는 연산이 필요하지 않음.
        for (int i = 2; i <= n; i++) { //2부터 n까지 증가시켜가면서 각 단계의 dp[i] 값을 구함 (최솟값)
            //1번 연산 수행한 값을 디폴트로 설정. : -1 연산
            dp[i] = dp[i - 1] + 1;

            //dp[i] 와 dp[i/2] + 1 비교 (-1 연산과 /2 연산 비교 > 최솟값 dp[i]로 저장)
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            //dp[i] 와 dp[i/3] + 1 비교 (-앞서서 구한 최솟값과 /3 연산 비교 > 최솟값 dp[i]로 최종 저장.
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
