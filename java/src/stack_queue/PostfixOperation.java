package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixOperation {

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.peek();
        
        return answer;
    }

    public static void main(String[] args) {
        PostfixOperation main = new PostfixOperation();
        Scanner scan = new Scanner((System.in));

        String str = scan.next();

        System.out.println(main.solution(str));
    }
}