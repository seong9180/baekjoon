/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.Class2.BOJ30802;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //사람 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizes = new int[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt((st.nextToken()));
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st1.nextToken()); //티셔츠 묶음 수
        int p = Integer.parseInt(st1.nextToken()); //펜의 묶음 수

//        출력 :
//        첫 줄에 티셔츠를 몇 묶음 주문해야 하는지
//        다음 줄에 펜을 몇 묶음 개별로 몇 자루 구매해야하는지

        Arrays.sort(sizes);
        int shirtCnt = 0;
        for (int i = 0; i < 6; i++) {
            if (sizes[i] != 0) {
                if (sizes[i] % t == 0) {
                    shirtCnt += sizes[i] / t; //딱 맞아 떨어진다면 나눠지는 몫 == 묶음 구매 개수
                }else{
                    shirtCnt += sizes[i] / t + 1; //0이 아니라면 최소 1그룹 구매부터 시작.
                }
            }
        }
        int penCnt = 0;
        penCnt = n / p;
        int eaCnt = n % p;

        System.out.println(shirtCnt);
        System.out.println(penCnt + " " + eaCnt);
    }
}