/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ29863;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        int sleepTime = Integer.parseInt(br.readLine()); // 20 ~ 23 or 0 ~ 3
        int wakeTime = Integer.parseInt(br.readLine()); // 5 ~ 10

        int solution = 0;

        if (sleepTime < 20) {
            solution = wakeTime - sleepTime;
        }else{
            solution = (24 - sleepTime) + wakeTime;
        }

        System.out.println(solution);
    }
}