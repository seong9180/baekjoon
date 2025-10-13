/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ26307;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        // TOPC 시작시간 9:00 AM
        // Charlie 조 끝낸 시간 : HH : MM AM

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int totalTime = 0;
        totalTime = (hour - 9) * 60 + minute;

        System.out.println(totalTime);
    }
}