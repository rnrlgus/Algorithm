
import java.util.*;

public class Main  {

    static int n, change;
    static Integer[] coin;

    static int answer=Integer.MAX_VALUE;

    public void DFS(int cnt, int sum) {
        if (sum > change || answer < cnt) return ;
        if (sum == change) {
            if (cnt < answer) answer = cnt;
        } else {
            for (int i = 0; i < n; ++i) {
                DFS(cnt+1, sum + coin[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        coin= new Integer[n];
        for (int i = 0; i < n; ++i) {
            coin[i] = scan.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());

        change = scan.nextInt();

        main.DFS(0,0);
        System.out.println(answer);
    }
}