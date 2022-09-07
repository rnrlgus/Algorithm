package string;

import java.util.Scanner;

public class RemoveOverlappedChars {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); ++i) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        RemoveOverlappedChars main = new RemoveOverlappedChars();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();

        System.out.println(main.solution(str));

    }
}