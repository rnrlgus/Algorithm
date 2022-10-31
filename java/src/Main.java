
import java.util.*;

public class Main  {

    static int n, change;
    static int[] coin;

    public void DFS(int p) {

     }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        coin= new int[n];
        for (int i = 0; i < n; ++i) {
            coin[i] = scan.nextInt();
        }

        change = scan.nextInt();



        main.DFS(0);
    }
}