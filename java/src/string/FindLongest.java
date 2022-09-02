package string;

import java.util.Scanner;

public class FindLongest {
    public FindLongest() {
    }

    public String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;

        int pos;
        for(String[] arr = str.split(" "); (pos = str.indexOf(" ")) != -1; str = str.substring(pos + 1)) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > min) {
                min = tmp.length();
                answer = tmp;
            }
        }

        if (str.length() > min) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindLongest main = new FindLongest();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(main.solution(str));
    }
}

