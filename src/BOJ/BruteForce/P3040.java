/*
    BOJ 3040 백설 공주와 일곱 난쟁이
    Status: v2
    Key:
    Notes:
    Last Reviewed: 2025-08-29
*/

package BOJ.BruteForce;

import java.io.*;
import java.util.*;

public class P3040 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] gnome = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            gnome[i] = Integer.parseInt(br.readLine());
            //9명의 숫자 전부 합 구함
            sum += gnome[i];
        }
        //System.out.println("sum = " + sum);

        int diff = 0;
        //7명의 합이 100이 되는 조건이 유일 -> 9명의 합에서 100을 빼면 스파이 두명의 합이 나옴.
        diff = sum - 100;
        int spy1 = 0, spy2 = 0;

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (gnome[i] + gnome[j] == diff) {
                    spy1 = gnome[i];
                    spy2 = gnome[j];
                    break outer;
                }
            }
        }
//        System.out.println("spy1 = " + spy1);
//        System.out.println("spy2 = " + spy2);

        for (int i = 0; i < 9; i++) {
            if(gnome[i] != spy1 && gnome[i] != spy2){
                System.out.println(gnome[i]);
            }
        }



    }


}