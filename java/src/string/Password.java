package string;

import java.util.Scanner;

public class Password {

    public String solution(String str, int n) {
        String answer = "";

        for (int i = 0; i < n; ++i) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int decimal = Integer.parseInt(tmp, 2);
            answer += (char) decimal;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Password main = new Password();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(main.solution(str, n));

    }
}