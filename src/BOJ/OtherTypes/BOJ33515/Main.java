/*
    플랫폼 / 문제번호 / 문제이름
    Status: v1
    Key:
    Notes:
    Last Reviewed: 2025-00-00
*/
package BOJ.OtherTypes.BOJ33515;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // TODO: solve
        // input : 다른 팀원들의 문제 풀이 완료 시간 (초)
        // ouput : 형진이 노트북을 사용할 수 있게 하는 최대 시간
        // conditon : 형진이가 제일 빨리 풀거나, 다른 팀원과 동일한 시간 내에 풀어야 함

        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());

        if (t1 == t2) {
            System.out.println(t2); // t1 == t2
        }else if(t1 > t2){
            System.out.println(t2);
        }else{ // t1 < t2
            System.out.println(t1);
        }

    }
}