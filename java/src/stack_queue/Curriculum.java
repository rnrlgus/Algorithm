package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {

    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x : str1.toCharArray()) {
            queue.offer(x);
        }
        for (char x : str2.toCharArray()) {
            if (queue.isEmpty()) break;
            if (x == queue.peek()) queue.poll();
        }
        if (!queue.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Curriculum main = new Curriculum();
        Scanner scan = new Scanner((System.in));

        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(main.solution(str1, str2));
    }
}