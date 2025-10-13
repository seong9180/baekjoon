/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.Class2.BOJ4153;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: solve
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if (a !=0 && a * a + b * b == c * c) {
                System.out.println("right");
            }else if(a == 0 && b == 0 & c ==0){
                break;
            }else{
                System.out.println("wrong");
            }

        }
    }
}