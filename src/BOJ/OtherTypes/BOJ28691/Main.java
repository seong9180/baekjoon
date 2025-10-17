/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ28691;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문제 조건상 한 글자만 입력됨 (M, W, C, A, $)
        String s = br.readLine();     // 예: "M"
        char ch = s.charAt(0);        // 첫 글자만 사용

        String answer;
        // 각 첫 글자에 대해 대응되는 동아리 전체 이름 매핑
        switch (ch) {
            case 'M':
                answer = "MatKor";
                break;
            case 'W':
                answer = "WiCys";
                break;
            case 'C':
                answer = "CyKor";
                break;
            case 'A':
                answer = "AlKor";
                break;
            case '$':
                answer = "$clear";
                break;
            default:
                // 문제 조건상 올 수 없으나, 방어 코드
                answer = "";
        }

        // 결과 출력 (대소문자 구분)
        System.out.println(answer);
    }
}