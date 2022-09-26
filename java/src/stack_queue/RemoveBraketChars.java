package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBraketChars {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else if (x == ')') stack.pop();
            else if (!stack.isEmpty()) continue;
            else answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveBraketChars main = new RemoveBraketChars();
        Scanner scan = new Scanner((System.in));

        String str = scan.next();

        System.out.print(main.solution(str));
    }
}