package string;

import java.util.Scanner;

public class Reverse {

    public String solution(String str) {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            answer += str.charAt(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        Reverse main = new Reverse();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.println(main.solution(scan.next()));
        }


    }
}