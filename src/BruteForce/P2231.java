package BruteForce;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean exist = false;
        int minCreator  = 1000000;

        for (int i = 1; i < n; i++) {
            int partSum = 0;
            int tmd = i; //부분합 구하기 위해 i변경 전 값을 저장
            //tmd를 설정하지 않고 i를 while 문 안에 넣을 경우
            //for루프가 정상적으로 작동하지 않음.
            while(tmd > 0){
                partSum += tmd % 10;
                tmd /= 10;
            }
            if(partSum + i == n){
                exist = true;
                minCreator = Math.min(minCreator,i);
            }
        }

        if(exist){
            System.out.println(minCreator);
        }else{ //생성자 없는 경우
            System.out.println("0");
        }


    }
}
