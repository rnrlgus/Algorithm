package dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinChange {

    static int n, change;
    static Integer[] coin;

    static int answer=Integer.MAX_VALUE;

    public void DFS(int cnt, int sum) {
        if (sum > change || answer < cnt) return ;
        if (sum == change) {
            if (cnt < answer) answer = cnt;
        } else {
            for (int i = 0; i < n; ++i) {
                DFS(cnt+1, sum + coin[i]);
            }
        }
    }

    public static void main(String[] args) {
        CoinChange main = new CoinChange();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        coin= new Integer[n];
        for (int i = 0; i < n; ++i) {
            coin[i] = scan.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());

        change = scan.nextInt();

        main.DFS(0,0);
        System.out.println(answer);
    }
}