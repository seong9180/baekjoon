/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ13866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬해서 최대값 + 최소값 / 이외 나머지들 그룹으로 하면 차이의 최솟값 : 4명이라서
        Arrays.sort(arr);
        int solution = Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2]));

        System.out.println(solution);
    }
}