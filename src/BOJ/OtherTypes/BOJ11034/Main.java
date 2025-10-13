/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ11034;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = br.readLine()) != null) {
//            line = line.trim();
//            if (line.isEmpty()) continue;         // 빈 줄 방어
//
//            String[] parts = line.split("\\s+");  // 연속공백까지 포함
//            if (parts.length < 3) continue;       // 방어적 코드 (입력이 무조건 3개 아닐 때 skip)
//
//            int a = Integer.parseInt(parts[0]);
//            int b = Integer.parseInt(parts[1]);
//            int c = Integer.parseInt(parts[2]);
//
//            int max = Math.max(b - a, c - b);
//            System.out.println(max - 1);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) { // EOF까지 반복
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max(b - a, c - b);
            System.out.println(max - 1);
        }
    }
}