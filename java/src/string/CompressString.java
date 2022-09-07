package string;

import java.util.Scanner;

public class CompressString {

    public String solution(String str) {
        String answer = "";

        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        CompressString main = new CompressString();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();

        System.out.println(main.solution(str));

    }
}