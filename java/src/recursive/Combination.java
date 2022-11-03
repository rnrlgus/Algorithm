package recursive;

import java.util.Scanner;

public class Combination {

    int combination(int n, int r) {
        if (n == r) return 1;
        if (r == 1) return n;


        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
    public static void main(String[] args) {
        Combination main = new Combination();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();

        System.out.println(main.combination(n,r));


    }
}