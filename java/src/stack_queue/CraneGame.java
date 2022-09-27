package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class CraneGame {

    public int solution(int n, int[][] map, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int x : moves) {
            for (int i = 0; i < n; ++i) {
                if (map[i][x-1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == map[i][x-1]) {
                        stack.pop();
                        answer += 2;
                    }
                    else stack.push(map[i][x-1]);
                    map[i][x-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CraneGame main = new CraneGame();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; ++i) {
            moves[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, map, m, moves));
    }
}