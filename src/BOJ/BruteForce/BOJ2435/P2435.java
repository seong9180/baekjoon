/*
    BOJ 2435 기상청 인턴 신현수
    Status: v1  /
    Key:
    Notes:

*/

package BOJ.BruteForce.BOJ2435;
import java.util.Scanner;

public class P2435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        int max = -100*k;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += temp[i + j];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);

    }
}
