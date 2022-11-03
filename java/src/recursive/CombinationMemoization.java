package recursive;

import java.util.Scanner;

public class CombinationMemoization {

    static int[][] map;

    int combination(int n, int r) {
        if (map[n][r] != 0) return map[n][r];
        if (n == r || r == 0) return 1;
        else return map[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
    public static void main(String[] args) {
        CombinationMemoization main = new CombinationMemoization();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();

        map = new int[n+1][n+1];

        System.out.println(main.combination(n,r));


    }
}