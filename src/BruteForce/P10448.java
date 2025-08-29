/*
    BOJ 10448 유레카 이론
    Status: v2  / 최적화 진행 w.gpt
    Key:
    Notes:
    - for 문 내부에서 getTriangle 메서드를 반복 호출 -> tri[] 배열로 사전에 44개의 삼각수 미리 전처리 계산
    - StringTokenizer 사용 x -> 입력 받으면서 바로바로 nMax 가변화를 통해 계산
    - for 문 내부에서의 가지치기 추가 : 불필요한 계산 제거
    - outer break 를 추가하여, 성공한 경우 바로 다음 테스트케이스로 분기.

    추가로 정리해야 할 내용 :
    - Integer
    - ParseInt( BufferReader 의 원리와 그 응용)
    - outer break
    - trim
    Last Reviewed: 2025-08-28
*/

package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10448 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 1) 삼각수 전처리 (1000이하)
        int[] tri = new int[45]; //T44 = 990 , T45 > 1000
        int len = 0;
        for (int n = 1; n <= 44; n++) {
            tri[n] = n * (n + 1) / 2;
            len = n;
        }

        for (int tc = 0; tc < T; tc++) {
            int input = Integer.parseInt(br.readLine().trim());

            // 2) input 에 맞춰 탐색 상한 가변화 : T(n) <= input 까지만 탐색
            int nMax = 44;
            while(nMax > 1 && tri[nMax] > input) nMax--;

            boolean ok = false;

            outer:
            for (int i = 1; i <= nMax; i++) {
                int a = tri[i];
                if( a + 2 > input) break; //가지치기 a + tri[1] + tri[1] 이 input을 넘어버렸다면
                //더 이상 안 봐도 됨. a 가 너무 크다는 의미
                //실패 확정의 조기 종료

                for (int j = 1; j <= nMax; j++) {
                    int b = a + tri[j];
                    if(b + 1 > input) break; //조기 스킵. a + b + T(1) 이 input을 넘었다면
                    //더 이상 안 봐도 됨.

                    for (int k = 1; k <= nMax; k++) {
                        int sum = b + tri[k];
                        if (sum == input) {
                            System.out.println(1);
                            ok = true;
                            break outer; //즉시 다음 testcase로 분기
                            //성공 확정의 조기 종료
                        }
                        if (sum > input) break; //가지치기
                    }
                }
            }
            if(!ok) System.out.println(0);
        }


    }


}