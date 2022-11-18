import java.util.*;

class Main {

    static int[] dp;

    public int solution(int n, int[] arr){
        int answer = Integer.MIN_VALUE;

        for (int k=0; k<n; ++k) {
            dp[k] = 1;
            for (int i=0; i<k; ++i) {
                if (arr[i] < arr[k]) {
                    dp[k] = Math.max(dp[k], dp[i]+1);
                }
            }
            if (dp[k] > answer) answer = dp[k];
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int[] arr = new int[n];
        dp = new int[n];

        for(int i=0; i<n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}