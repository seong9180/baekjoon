/*
    BOJ 1251 단어 나누기
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-27
*/

package BOJ.BruteForce.BOJ1251;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1251 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int n = s.length();

        String best = null;
        /*
        문자열을 2번 쪼개서 3등분한다고 했을 때, i와 j로 슬라이싱하듯이 문자열을 인덱싱 하면 이해하기 편함
        •	A = s[0..i-1]
	    •	B = s[i..j-1]
	    •	C = s[j..n-1]

	    조건상 각 조각 길이가 1이상이여야 하므로
	    i 는 1 ~ n-2
	    j 는 i+1 ~ n-1
        */

        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                String a = s.substring(0, i);
                String b = s.substring(i, j);
                String c = s.substring(j);
                //가변 문자열 생성 -> 뒤집기 -> 일반 문자열 전환
                String ra = new StringBuilder(a).reverse().toString();
                String rb = new StringBuilder(b).reverse().toString();
                String rc = new StringBuilder(c).reverse().toString();

                String cand = ra + rb + rc;
                if (best == null || cand.compareTo(best) < 0) {
                    best = cand;
                }
            }
        }
        System.out.println(best);

    }
}