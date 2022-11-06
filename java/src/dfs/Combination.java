package dfs;

import java.util.Scanner;

public class Combination {

    static int n, m;
    static int[] check;

    void DFS(int L, int start) {
        if (L == m) {
            for (int i = 0; i < n + 1; ++i) {
                if (check[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            for (int i = start; i < n + 1; ++i) {
                if (check[i] == 0) {
                    check[i] = 1;
                    DFS(L+1, i+1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Combination main = new Combination();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        check = new int[n + 1];


        main.DFS(0, 1);
    }
}