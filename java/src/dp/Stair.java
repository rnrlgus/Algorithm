package dp;

import java.util.Scanner;

class Stair {

    static int[] dp;

    public int solution(int n){
        if (n < 3) return dp[n];
        else {
            for (int i=3; i<n+1; ++i) {
                dp[i] = dp[i-2] + dp[i-1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        Stair main = new Stair();
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        System.out.println(main.solution(n));
    }
}