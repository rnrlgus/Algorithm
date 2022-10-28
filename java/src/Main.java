
import java.util.*;

public class Main  {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visited;

    public void DFS(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int next : graph.get(start)) {
                if (visited[next] == 0) {
                    visited[next] = 1;
                    DFS(next);
                    visited[next] = 0;

                }
            }
        }
     }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        visited = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; ++i) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            graph.get(a).add(b);
        }

        visited[1] = 1;

        main.DFS(1);
        System.out.println(answer);
    }
}