package dfs;

import java.util.Scanner;

public class Permutation {

    static int n, m;
    static int[] arr, check;
    static int[] permutation;

    public void DFS(int p) {
        if (p == m) {
            for (int x : permutation) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; ++i) {
                if (check[i] == 0) {
                    permutation[p] = arr[i];
                    check[i] = 1;
                    DFS(p + 1);
                    check[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Permutation main = new Permutation();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        check = new int[n];

        permutation = new int[m];

        main.DFS(0);
    }
}