package dfs;

import java.util.Scanner;

public class PermutationWithRepetition {

    static int n, m;
    static int[] permutation;



    public void DFS(int p) {
        if (p == m) {
            for (int x : permutation) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i < n + 1; ++i) {
                permutation[p] = i;
                DFS(p+1);
            }
        }

     }

    public static void main(String[] args) {
        PermutationWithRepetition main = new PermutationWithRepetition();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        permutation = new int[m];

        main.DFS(0);
    }
}