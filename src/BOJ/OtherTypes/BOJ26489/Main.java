/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ26489;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        int cnt = 0;
        while (true) {
            String input = br.readLine();

            if(input == null){
                break;
            }else{
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}