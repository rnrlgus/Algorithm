package recursive;

import java.util.Scanner;

public class Fibonacci {
    public int solution(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return solution(n-1) + solution(n-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci main = new Fibonacci();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        System.out.println(main.solution(n));

    }
}
