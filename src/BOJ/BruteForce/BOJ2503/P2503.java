/*
    BOJ 2503 숫자야구
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-21
*/

package BOJ.BruteForce.BOJ2503;

import java.util.Scanner;

public class P2503 {
    public static boolean isValid(int x) {
        if (x % 10 == 0 || (x / 10)%10 == 0){
            //3자리 수 중 0은 없어야 함
            return false;
        }
        if (x / 100 == x % 10 || x / 100 == (x / 10) % 10 || x % 10 == (x / 10) % 10) {
            //서로 다른 3자리여야 함
            return false;
        }
        return true;
    }

    public static int[] countSB(int cand, int question) {
        //갹 숫자들의 자릿수를 변수에 저장
        int ca = cand / 100;
        int cb = cand % 10;
        int cc = (cand / 10)%10;

        int qa = question / 100;
        int qb = question % 10;
        int qc = (question / 10)%10;

        //판별 전 초기화
        int strike = 0;
        int ball = 0;

        //strike
        if(ca == qa) strike++;
        if (cb == qb) strike++;
        if (cc == qc) strike++;

        //ball
        if (ca != qa && (ca == qb || ca == qc)) ball++;
        if (cb != qb && (cb == qa || cb == qc)) ball++;
        if (cc != qc && (cc == qa || cc == qb)) ball++;

        return new int[]{strike, ball};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] question = new int[n]; //민혁이의 질문
        int[] strike = new int[n];
        int[] ball = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            question[i] = sc.nextInt();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        for (int i = 123; i <= 987; i++) {
            //숫자 유효성 확인
            if (!isValid(i)) {
                continue;
            }

            boolean ok = true;
            for (int j = 0; j < n; j++) {
                int[] cand = countSB(i, question[j]);
                if (strike[j] != cand[0] || ball[j] != cand[1]) {
                    ok = false;
                    break;
                }
            }
            if (ok) answer++;
        }

        System.out.println(answer);
    }
}