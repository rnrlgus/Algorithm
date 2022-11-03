package dfs;

import java.util.Scanner;

public class PermutationAssumption {

    boolean flag = false;
    static int n, f; // 1~n / final num
    static int[][] map; // combination memoization
    static int[] repNum;

    static int[] permutation, check;

    int combination(int n, int r) {
        if (map[n][r] != 0) return map[n][r];
        if (n == r || r == 0) return 1;
        else return map[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    void DFS(int L, int sum) {
        if (L == n) {
            if(flag == true) return ;
            if (sum == f) {
                for (int x : permutation) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i < n + 1; ++i) {
                if (check[i] == 0) {
                    check[i] = 1;
                    permutation[L] = i;
                    DFS(L + 1, sum + repNum[L] * permutation[L]);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PermutationAssumption main = new PermutationAssumption();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        f = scan.nextInt();

        map = new int[n+1][n+1];
        repNum = new int[n];
        for (int i = 0; i < n; ++i) {
            repNum[i] = main.combination(n - 1, i);
        }
        permutation = new int[n];
        check = new int[n+1];

        main.DFS(0, 0);
    }
}