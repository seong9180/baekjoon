package BruteForce;

import java.util.Scanner;

public class P18312 {
    public static boolean hasK(int x,int y) {
        //10의자리확인
        if (x / 10 == y || x % 10 == y) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i <= n; i++){ //0시부터 5시까지 라면 -> 6시간 (등호 필수)
            for(int j = 0; j <60; j++){
                for(int p = 0; p <60; p++){
                    if (hasK(i, k) || hasK(j, k) || hasK(p, k)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        //helped by gpt

    }
}
