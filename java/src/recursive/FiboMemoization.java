package recursive;

import java.util.Scanner;

public class FiboMemoization {

    static int[] fibo;
    public int solution(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = solution(n-1) + solution(n-2);
        }
    }

    public static void main(String[] args) {
        FiboMemoization main = new FiboMemoization();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        fibo = new int[n+1];
        System.out.println(main.solution(n));
        System.out.println(fibo[n]);
    }
}
