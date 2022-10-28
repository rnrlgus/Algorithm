package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathBFS {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visited, distance;

    public void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = 1;
        distance[start] = 0;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.get(current)) {
                if (visited[next] == 0) {
                    visited[next] = 1;
                    queue.offer(next);
                    distance[next] = distance[current]+1;

                }
            }
        }
     }

    public static void main(String[] args) {
        ShortestPathBFS main = new ShortestPathBFS();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();

        distance = new int[n + 1];
        visited = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            graph.get(a).add(b);
        }

        visited[1] = 1;

        main.BFS(1);

        for (int i = 2; i < n; ++i) {
            System.out.println(distance[i]);
        }
    }
}