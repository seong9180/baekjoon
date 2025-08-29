package BOJ.IO.BOJ10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt(); //testcase
        for (int i = 0; i < t; i++) {
            String input = sc.next(); //입력 전체를 문자열로 받음
            char a = input.charAt(0); //문자열에서 필요 부분을 인덱싱해서 문자로 저장
            char b = input.charAt(2);

            int new_a = a - '0'; //char -> int 변환
            int new_b = b - '0';

            System.out.println(new_a + new_b);
        }
    }
}
