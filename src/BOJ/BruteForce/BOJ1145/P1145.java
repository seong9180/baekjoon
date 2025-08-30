/*
    BOJ 1145 적어도 대부분의 배수
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-21
*/
package BOJ.BruteForce.BOJ1145;
import java.util.Scanner;

public class P1145 {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;

    public static boolean isValid(int x) {
        int count = 0;
        if(x % a == 0) count++;
        if(x % b == 0) count++;
        if(x % c == 0) count++;
        if(x % d == 0) count++;
        if(x % e == 0) count++;

        if (count >= 3) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int[] arr = {a, b, c, d, e};

        int min = 1000000;
        for (int i = 0; i < 5; i++) {
            min = Math.min(min, arr[i]);
        }

        for (int i = min; i < 1000000; i++) {
            //자연수의 최대값 100, 적어도 3개로 나뉘어진다는 건 최대값이 100^3
            if (isValid(i)) { //첫번째로 나온 값이 최소값
                System.out.println(i);
                return; //종료
            }
        }

    }
}
