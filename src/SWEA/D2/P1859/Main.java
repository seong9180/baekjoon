/*
    SWEA 1859 백만 장자 프로젝트
    Status: v2 : input.txt 직접 테스트
    Key:
    Notes:
    IDE 콘솔 자체에서 읽을 수 있는 버퍼 크기 제한이 존재한다는 사실을 알게 됨.
    input.txt 파일 자체를 Filestream 으로 입력 받는 경우에는 정상적으로 테스트케이스가 작동하지만,
    ctrl c+v 를 한 경우, 콘솔 자체 버퍼 한계로 인해 입력단계에서 오류 발생함.
    처음 겪어보는 현상으로써, 테스트케이스의 크기가 매우 크다면 텍스트 파일 자체를 테스트로 활용하는 방안도 고려해야 할 듯
    Last Reviewed: 2025-09-06
*/
package SWEA.D2.P1859;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //input.txt 파일을 직접 입력 스트림으로 연결
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("ps/src/SWEA/D2/P1859/input.txt")));

        // TODO: solve
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] price = new int[n];
            for (int j = 0; j < n; j++) {
                price[j] = Integer.parseInt(st.nextToken());
            }

            long maxProfit = 0;
            int maxPrice = price[n-1];
            for (int j = n - 1; j >= 0; j--) {
                if (price[j] > maxPrice) {
                    maxPrice = price[j];
                } else {
                    maxProfit += maxPrice - price[j];
                }
            }
            System.out.println("#" + (i+1) + " " + maxProfit);

        }



    }
}