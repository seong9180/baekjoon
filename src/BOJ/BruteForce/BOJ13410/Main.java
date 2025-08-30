/*
    BOJ 13410 거꾸로 구구단
    Status: v1
    Key:
    int -> String
    String -> StringBuilder -> 연산
    StringBuilder -> String -> int

    Notes:
*/
package BOJ.BruteForce.BOJ13410;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int i = 1; i <= k; i++) {
            int tmp = n * i;
            String str = Integer.toString(tmp);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            int reversed = Integer.parseInt(sb.toString()); //StringBuilder -> String : toString()
            if (reversed >= max) {
                max = reversed;
            }
        }

        System.out.println(max);

    }
}