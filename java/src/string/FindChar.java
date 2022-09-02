package string;

import java.util.Scanner;

public class FindChar {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for (int i = 0; i < str.length(); ++i) {
//            if (str.charAt(i) == c) {
//                answer += 1;
//            }
//        }

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindChar findChar = new FindChar();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();
        char c = scan.next().charAt(0);


        System.out.println(findChar.solution(str, c));

    }
}