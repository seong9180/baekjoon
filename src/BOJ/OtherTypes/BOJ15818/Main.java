/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ15818;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long result = 1;
        int[] arr = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < n; i++) {
            //result *= (arr[i] % m);
            //result %= m;
            result = (result * (arr[i] % m)) % m;
        }

        System.out.println(result);
    }
}