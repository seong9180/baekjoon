/*
    BOJ 2422 한윤정이 이탈리아에 가서 아이스크림을 사먹는데
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-22
*/

package BOJ.BruteForce;
import java.util.Scanner;

public class P2422 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        boolean[][] bad = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            bad[a][b] = true;
            bad[b][a] = true;
        }

        for (int i = 1; i <= n; i++) { //bad 와 인덱스를 맞추기 위해 1부터 시작
            for (int j = i + 1; j <= n; j++) {
                if(bad[i][j]) continue; // i,j 가 금지 조합이변 continue
                for (int k = j + 1; k <= n; k++) {
                    if (bad[j][k] || bad[i][k]) {
                        continue;
                    }
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
