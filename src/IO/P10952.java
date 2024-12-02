package IO;

import java.util.Scanner;

public class P10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) { //다음 입력에 INT 가 존재할 때 까지.
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > 0 && b > 0) {
                System.out.println(a + b);
            } else {
                break;
            }

        }
    }
}
