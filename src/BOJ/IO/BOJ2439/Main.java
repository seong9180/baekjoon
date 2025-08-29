package BOJ.IO.BOJ2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = n - 1; j > i; j--) {
                System.out.print(" "); //공백 출력
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}
