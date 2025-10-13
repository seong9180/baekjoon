 /*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.Class1.BOj2753;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve

        int year = Integer.parseInt(br.readLine());
        if (isLeapyear(year)) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean isLeapyear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0);
    }
}