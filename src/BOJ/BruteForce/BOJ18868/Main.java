/*
    BOJ 18868 멀티버스1
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-09-05
*/
package BOJ.BruteForce.BOJ18868;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] planet = new int[m][n];
        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                planet[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        int count = 0; //균등한 우주 개수 저장

        for (int i = 0; i < m; i++) { //모든 우주에 대해서
            for (int j = i + 1; j < m; j++) { //대응할 우주 쌍 탐색
                boolean isUniform = false;
                outer :
                for (int k = 0; k < n; k++) { //우주 내부 -> 행성 인덱스
                    for (int p = k + 1; p < n; p++) { //대응할 행성 쌍
                        if (planet[i][k] < planet[i][p] && planet[j][k] < planet[j][p]) {
//                            System.out.println("조건 1 : ai < aj -> bi < bj");
//                            System.out.println("우주 = " + i + " 우주 = " + j + " 행성 = " + k +  " 행성 = " + p);
                            isUniform = true;
                        }else if(planet[i][k] == planet[i][p] && planet[j][k] == planet[j][p]){
//                            System.out.println("조건 2 : ai = aj -> bi = bj");
//                            System.out.println("우주 = " + i + " 우주 = " + j + " 행성 = " + k +  " 행성 = " + p);
                            isUniform = true;
                        }else if(planet[i][k] > planet[i][p] && planet[j][k] > planet[j][p]){
//                            System.out.println("조건 3 : ai > aj -> bi > bj");
//                            System.out.println("우주 = " + i + " 우주 = " + j + " 행성 = " + k +  " 행성 = " + p);
                            isUniform = true;
                        }else { //우주 내의 행성 쌍을 비교할 때 한번이라도 false 라면 Break
//                            System.out.println("조건 false");
//                            System.out.println("우주 = " + i + " 우주 = " + j + " 행성 = " + k +  " 행성 = " + p);
                            isUniform = false;
                            break outer;
                        }
                    }
                }
                if(isUniform) count++;
            }
        }

        System.out.println(count);

    }
}