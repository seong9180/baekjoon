/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ32951;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //그냥 StringTozenizer 안쓸땐 주석처리하는게 낫곘다

        // TODO: solve
        int startYear = 2024;
        int n = Integer.parseInt(br.readLine());

        System.out.println(n - startYear);
    }
}