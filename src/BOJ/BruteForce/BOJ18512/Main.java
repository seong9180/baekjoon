/*
    BOJ 18512 점프 점프
    Status: v1
    Key:
    Notes:
*/
package BOJ.BruteForce.BOJ18512;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int minPoint = 10000;
        boolean ifMeet = false; //만났는지 여부 체크.

        //점프 횟수를 각각 100번씩으로 임의 설정. (x,y,p1,p2 다 100 이하의 자연수라서
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (p1 + x * i == p2 + y * j) {
                    int meetPoint = p1 + x * i;
                    ifMeet = true;
                    minPoint = Math.min(minPoint, meetPoint);
                }
            }
        }

        if (ifMeet) {
            System.out.println(minPoint);
        } else {
            System.out.println(-1);
        }
    }
}