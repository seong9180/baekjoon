/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ32314;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // TODO: solve
        int ampere = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int watt = Integer.parseInt(st.nextToken());
        int volt = Integer.parseInt(st.nextToken());

        int adapt_ampere = watt / volt;
        if (ampere <= adapt_ampere) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}