package BOJ.IO;

import java.util.Scanner;

public class P11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) { //intelliJ 에서는 EOF 확인이 안 되는 방법. 입력이 파일이여야만 함.
            //더 나은 방법에 대한 연구가 필요함
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}
