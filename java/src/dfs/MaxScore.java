package dfs;

import java.util.Scanner;

public class MaxScore {

    static int n, m;
    static int[] arr1, arr2;
    static int answer = 0;


    public void DFS(int p, int sum, int time) {
        if (time > m) return ;
        if (p == n) {
            answer = Math.max(sum, answer);
        } else {
            DFS(p+1, sum + arr1[p], time + arr2[p]);
            DFS(p+1, sum, time);
        }

     }

    public static void main(String[] args) {
        MaxScore main = new MaxScore();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        arr1 = new int[n];
        arr2 = new int[n];
        for (int i = 0; i < n; ++i) {
            arr1[i] = scan.nextInt();
            arr2[i] = scan.nextInt();
        }

        main.DFS(0, 0, 0);
        System.out.println(answer);


    }
}