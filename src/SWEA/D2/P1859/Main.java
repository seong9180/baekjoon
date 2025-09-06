/*
    SWEA 1859 백만 장자 프로젝트
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-09-05
*/
package SWEA.D2.P1859;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: solve
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] price = new int[n];
            for (int j = 0; j < n; j++) {
                price[j] = Integer.parseInt(st.nextToken());
            }

            long maxProfit = 0;
            int maxPrice = price[n-1];
            for (int j = n - 1; j >= 0; j--) {
                if (price[j] > maxPrice) {
                    maxPrice = price[j];
                } else {
                    maxProfit += maxPrice - price[j];
                }
            }
            System.out.println("#" + (i+1) + " " + maxProfit);

        }



    }
}