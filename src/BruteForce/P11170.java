/*
    BOJ 11170 0의 개수
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-27
*/

package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11170 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k = 0; k < t; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = a; i <= b; i++) {
                //int -> 문자열 변환 -> 문자열 길이만큼 루프
                for (int j = 0; j < Integer.toString(i).length(); j++) {
                    //문자열 길이만큼 한 문자씩 읽어서 0이면 카운트
                    if (Integer.toString(i).charAt(j) == '0') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }
}