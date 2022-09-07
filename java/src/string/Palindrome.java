package string;

import java.util.Scanner;

public class Palindrome {

    public String solution(String str) {
        String answer = "NO";
//        str = str.toLowerCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; ++i) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome main = new Palindrome();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();

        System.out.println(main.solution(str));

    }
}