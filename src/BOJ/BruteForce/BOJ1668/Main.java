/*
    BOJ 1668 트로피 진열
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-30
*/

package BOJ.BruteForce.BOJ1668;

import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine()); //매 줄 입력받기 때문에 StringTokenizer 필요 x
        }

        int leftCount = 0;
        leftCount = trophyCountAtLeft(arr);
        int rightCount = 0;
        rightCount = trophyCountAtRight(arr);

        System.out.println(leftCount);
        System.out.println(rightCount);
    }

    public static int trophyCountAtLeft(int[] arr) {
        int count = 1; //무조건 맨 앞 트로피는 보이니까 기본값 1부터 시작
        int tallest = arr[0];
        for (int i = 1; i < n; i++) { //두번째 트로피부터
            if (arr[i] > tallest) { //현재 가장 높은 트로피보다 높아야 보임
                tallest = arr[i]; //최대값 갱신
                count++;
            }
        }
        return count;
    }
    public static int trophyCountAtRight(int[] arr) {
        int count = 1; //무조건 맨 앞 트로피는 보이니까 기본값 1부터 시작
        int tallest = arr[n-1]; //오른쪽 기준 맨 앞 트로피를 최대값으로 지정
        for (int i = n - 2; i >= 0; i--) { //두번째 트로피부터 for 문 역순으로
            if (arr[i] > tallest) { //현재 가장 높은 트로피보다 높아야 보임
                tallest = arr[i]; //최대값 갱신
                count++;
            }
        }
        return count;
    }
}
