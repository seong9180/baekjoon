package BOJ.IO;

import java.util.Scanner;

public class P10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(n >= 3 && i > 0){
                for(int j = 0; j < 2*i - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0 ; i < 2*n - 1; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
