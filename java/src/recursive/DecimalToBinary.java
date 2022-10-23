package recursive;

import java.util.*;

public class DecimalToBinary  {
    public int solution(int n) {
        if (n == 0) {
//            System.out.print(n%2 + " ");
            return 0;
        } else {
            solution(n / 2);
            System.out.print(n%2 + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        DecimalToBinary main = new DecimalToBinary();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        main.solution(n);

    }
}
