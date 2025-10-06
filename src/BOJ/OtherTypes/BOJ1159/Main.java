/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ1159;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        int number = Integer.parseInt(br.readLine());

        String[] members = new String[number];
        for (int i = 0; i < number; i++) {
            members[i] = br.readLine();
        }

        // 소문자 char 배열
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] lowerCount = new int[26];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < lower.length; j++) {
                if(members[i].charAt(0) == lower[j]){
                    lowerCount[j]++;
                    break;
                }
            }
        }
        boolean memberExist = false;

        for (int i = 0; i < lower.length; i++) {
            if(lowerCount[i] >= 5) {
                memberExist = true;
                System.out.print(lower[i]);
            }
        }
        if(!memberExist){
            System.out.println("PREDAJA");
        }

    }
}