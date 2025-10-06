/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ15232;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve

        //StringTokenizer 선언해두면 두번쨰 값을 공백으로 받아서 문제가 생김.
        //항상 StringTokenizer 를 선언해두면 문제가 생길 수 있다는 사실을 확인

        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        //System.out.println(r + c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}