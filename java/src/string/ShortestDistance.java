package string;

import java.util.Scanner;

public class ShortestDistance {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int tmp = 1000;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == c) {
                tmp = 0;
                answer[i] = tmp;
            } else {
                tmp ++;
                answer[i] = tmp;
            }
        }

        tmp = 1000;
        for (int i = str.length() - 1; i >= 0; --i) {
            if (str.charAt(i) == c) {
                tmp = 0;
                answer[i] = tmp;
            } else {
                tmp += 1;
                if (answer[i] > tmp) {
                    answer[i] = tmp;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        ShortestDistance main = new ShortestDistance();
        Scanner scan = new Scanner((System.in));
        String str = scan.next();
        char c = scan.next().charAt(0);

        for (int x : main.solution(str, c)) {
            System.out.print(x + " ");
        }

    }
}