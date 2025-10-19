/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ26592;

import java.io.*;
import java.util.*;

public class Main {
    public static void getHeight(float a, float b) {
        float height = (2 * a) / b;
        System.out.print("The height of the triangle is ");
        System.out.printf("%.2f", height);
        System.out.print(" units");
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            float area = Float.parseFloat(st.nextToken());
            float baseLength = Float.parseFloat(st.nextToken());

            getHeight(area, baseLength);


        }


    }
}