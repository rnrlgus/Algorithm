package dfs;

import java.util.Scanner;

public class RootSearch {

    static int n, m, answer = 0;
    static int[][]graph;
    static int[] visited;

    public void DFS(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; ++i) {
                if (graph[start][i] == 1 && visited[i] == 0) {
                    visited[i] = 1;
                    DFS(i);
                    visited[i] = 0;
                }
            }
        }
     }

    public static void main(String[] args) {
        RootSearch main = new RootSearch();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        visited = new int[n + 1];
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            graph[a][b] = 1;
        }

        visited[1] = 1;

        main.DFS(1);
        System.out.println(answer);
    }
}