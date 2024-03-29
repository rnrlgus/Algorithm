import java.util.*;

class Main {
    static int[] dp;

    public int solution(int n, int[] arr, int m){
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i=0; i<n; ++i) {
            for (int j=arr[i]; j<=m; ++j) {
                dp[j] = Math.min(dp[j-arr[i]] + 1, dp[j]);
            }
        }

        return dp[m];
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; ++i) {
            arr[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        dp = new int[m+1];

        System.out.println(main.solution(n, arr, m));

    }
}