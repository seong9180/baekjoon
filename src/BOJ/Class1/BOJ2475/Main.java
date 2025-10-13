/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.Class1.BOJ2475;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int solution = validNUm(arr);
        System.out.println(solution);

    }

    public static int validNUm(int[] arr) {
        int doubledNum = 0;
        for (int i = 0; i < arr.length; i++) {
            doubledNum += arr[i] * arr[i];
        }

        int validNumer = doubledNum % 10;
        return validNumer;
    }
}