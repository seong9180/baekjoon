package IO;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - '0'; //문자 - '0' > int
            sum += a;
        }
        System.out.println(sum);
    }
}
