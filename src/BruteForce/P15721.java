/*
    BOJ 15721 번데기 게임
    Status: v2 (재풀이) / Solved
    Key: 시뮬레이션(기본4 → 뻔(r+1) → 데기(r+1)), pos는 말한 뒤에 증가
    Notes:
        - count==T 검사 시점은 pos 증가 전에
        - T≤10000 → 완전 시뮬로도 충분
    Last Reviewed: 2025-08-19
*/

package BruteForce;

import java.util.Scanner;

public class P15721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int t = sc.nextInt();
        int symbol = sc.nextInt(); //뻔 - 0, 데기 - 1

        int pos = 0; //현재 순서인 사람
        int round = 1;
        int count = 0; //목표 구호가 나온 횟수

        while (true) {
            int[] base = {0,1,0,1}; //매번 반복되는 기본 구조
            for (int chant : base) {
                if (chant == symbol) {
                    count++;
                    if (count == t) { //목표수치에 도달했다면
                        System.out.println(pos);
                        return; //종료
                    }
                }
                pos = (pos + 1) % a;
            }

            // 회차 + 1 만큼 뻔/데기가 반복되기 떄문에 round+1
            for (int i = 0; i < round + 1; i++) {
                if (0 == symbol) {
                    count ++;
                    if (count == t) {
                        System.out.println(pos);
                        return;
                    }
                }
                pos = (pos + 1) % a;
            }

            //3 데기
            for (int i = 0; i < round + 1; i++) {
                if (1 == symbol) {
                    count++;
                    if (count == t) {
                        System.out.println(pos);
                        return;
                    }
                }
                pos = (pos + 1) % a;
            }
            round++;
        }


    }
}
