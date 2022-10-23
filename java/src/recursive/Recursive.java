package recursive;

import java.util.Scanner;

public class Recursive {
    public int solution(int n) {
        if (n <= 0) {
            return 0;
        } else {
            solution(n-1);
            System.out.print(n + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Recursive main = new Recursive();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        main.solution(n);

    }
}
