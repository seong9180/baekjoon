/*
    BOJ 1969 DNA
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-20
*/

package BOJ.BruteForce;

import java.util.Scanner;
import java.util.Arrays;

public class P1969 {
    public static char hammingDNA(int a, int c, int g, int t) {
        int max = a;
        int[] arr = {a, c, g, t};
        for (int i = 0; i < 4; i++) {
            max = Math.max(arr[i],max);
        }

        if (max == a && a >= c && a >= g && a >= t) {
            return 'A';
        } else if (max == c && c > a && c >= g && c >= t) {
            return 'C';
        } else if (max == g && g > a && g > c && g >= t) {
            return 'G';
        } else {
            return 'T';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //dna 숫자
        int m = sc.nextInt();; //문자열의 길이
        String[] dna = new String[n];

        for (int i = 0; i < n; i++) {
            dna[i] = sc.next();
        }

        char[] answer = new char[m];

        //사전순으로 가장 앞서는 것 부터 출력 : A < C < G < T
        for (int i = 0; i < m; i++) {
            int countA = 0, countC = 0, countG = 0, countT = 0;
            for (int j = 0; j < n; j++) {
                if(dna[j].charAt(i) == 'A'){
                    countA++;
                } else if (dna[j].charAt(i) == 'C') {
                    countC++;
                } else if (dna[j].charAt(i) == 'G') {
                    countG++;
                } else {
                    countT++;
                }
                answer[i] = hammingDNA(countA, countC, countG, countT);
            }

        }
        int hammingDistance = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (answer[j] != dna[i].charAt(j)) {
                    hammingDistance++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(answer[i]);
        }
        System.out.println();
        System.out.println(hammingDistance);

    }
}