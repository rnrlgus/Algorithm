import java.util.*;

public class Main  {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n-1);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        System.out.println(main.solution(n));

    }
}
