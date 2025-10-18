/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ5543;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: solve

        int[] burger = new int[3];
        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }

        int[] beverage = new int[2];
        for (int i = 0; i < 2; i++) {
            beverage[i] = Integer.parseInt(br.readLine());
        }

        int minPriceSet = 4000; //2000 + 2000
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                minPriceSet = Math.min(minPriceSet, burger[i] + beverage[j]);
            }
        }

        System.out.println(minPriceSet - 50);

    }
}