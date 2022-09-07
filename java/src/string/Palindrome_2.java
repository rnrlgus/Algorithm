package string;

import java.util.Scanner;

public class Palindrome_2 {

    public String solution(String str) {
        String answer = "";
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome_2 main = new Palindrome_2();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();

        System.out.println(main.solution(str));

    }
}