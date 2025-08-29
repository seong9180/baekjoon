package BOJ.BruteForce;

import java.util.Scanner;

public class P19532 {
    public static int[] numbers = new int[6];
    public static boolean Formula1(int x, int y){
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        if(a * x + b * y == c){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Formula2(int x, int y){
        int a = numbers[3];
        int b = numbers[4];
        int c = numbers[5];

        if(a * x + b * y == c){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Formula3(int x, int y){
        int a = numbers[0] + numbers[3];
        int b = numbers[1] + numbers[4];
        int c = numbers[2] + numbers[5];

        if(a * x + b * y == c){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 6; i++){
            numbers[i] = sc.nextInt();
        }

        int x = 0;
        int y = 0;
        for(int i = -999; i <= 999; i++){
            for(int j = -999; j <= 999; j++){
                if(Formula1(i,j) && Formula2(i,j) && Formula3(i,j)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
