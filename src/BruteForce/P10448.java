/*
    BOJ 10448 유레카 이론
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-28
*/

package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10448 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < T; i++) {
            boolean ok = false;
            for (int j = 1; j <= 44; j++) { //T44 = 990 이기 때문에  T45 는 1000을 넘어감.
                if (!ok) {
                    for (int k = 1; k <= 44; k++) {
                        if(!ok){
                            for (int p = 1; p <= 44; p++) {
                                if (getTriangularNum(j) + getTriangularNum(k) + getTriangularNum(p) == arr[i]) {
                                    //System.out.println("j = " + j + " k = " + k + " p = " + p);
                                    System.out.println(1);
                                    ok = true;
                                    continue;
                                }else{
                                    //System.out.println("else at for_p");
                                    continue;
                                }
                            }
                        }else {
                            //System.out.println("else at for_k");
                            continue;
                        }
                    }
                }else{
                    //System.out.println("else at for_j");
                    continue;
                }
            }
            if(!ok) System.out.println(0);
        }

    }

    public static int getTriangularNum(int x) {
        return x * (x + 1) / 2;
    }
}