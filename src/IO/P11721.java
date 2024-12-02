package IO;

import java.util.Scanner;

public class P11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); //input

        for (int i = 0; i < s.length(); i++) {
            if ((i % 10) != 0) {
                System.out.print(s.charAt(i));
            } else if (i != 0) { //i가 0일땐 줄바꿈이 들어가선 안 됨.
                System.out.println();//10의 배수번마다 줄바꿈
                System.out.print(s.charAt(i));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
