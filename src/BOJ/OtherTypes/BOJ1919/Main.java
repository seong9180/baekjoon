/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ1919;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        int[] count = new int[26]; //알파벳에 맞춰 인덱싱

        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            count[word2.charAt(i) - 'a']--;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count[i]);
        }
        System.out.println(result);

    }


}