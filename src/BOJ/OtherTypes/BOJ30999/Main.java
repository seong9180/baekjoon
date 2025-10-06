/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ30999;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];

        //String 의 경우엔 따로 파싱이 필요없고 그냥 readline() 만 하면 된다.
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int passed = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if(arr[i].charAt(j) == ('O')){
                    cnt++;
                }
            }
            if(cnt > (m / 2)){ //과반수의 찬성을 얻은 경우 문제 통과
                passed++;
            }
        }

        System.out.println(passed);
    }
}