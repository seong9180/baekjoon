/*
    SWEA 21425 +=
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-09-05
*/
package SWEA.D2.P21425;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: solve
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int count = 1;
            while (a <= n && b <= n) {
                if (count % 2 != 0) {
                    a += b;
                    count ++;
                }else{
                    b += a;
                    count ++;
                }
            }
            System.out.println(count - 1);
        }
    }
}