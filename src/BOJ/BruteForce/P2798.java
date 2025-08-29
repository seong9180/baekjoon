package BOJ.BruteForce;

import java.util.Scanner;
import java.util.Arrays;

public class P2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //카드개수
        int m = sc.nextInt(); //메이드 숫자

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        //Arrays.sort(cards);
        int cardSum = 0;
        int diffWithBlackJack = 0; //목표 숫자 m 과의 차이
        int minDiff = 300000;
        int answer = 0; //답을 저장할 변수

        for(int i = 0  ; i< n; i++){
            cardSum = cards[i];
            for (int j = 0; j <n; j++) { //3장 카드의 합 완전탐색
                if(j != i){
                    cardSum += cards[j];
                }else continue;
                for(int k = 0 ; k < n; k++){
                    if(k != i && k != j){
                        cardSum += cards[k];
                    }else continue;

                    diffWithBlackJack = m - cardSum;
                    if(diffWithBlackJack >= 0){ //cardSum 은 m을 넘지 않아야 함
                        minDiff = Math.min(diffWithBlackJack, minDiff);
                        if(minDiff == diffWithBlackJack){ //목표 숫자와의
                            answer = cardSum;
                        }
                    }
                    cardSum -= cards[k];
                }
                cardSum -= cards[j];
            }
            cardSum = 0; //초기화
        }

        System.out.println(answer);

    }
}
