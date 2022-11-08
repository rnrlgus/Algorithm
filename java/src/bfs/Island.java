package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Island {

    static int n, answer = 0;
    static int[][] map;
    static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 8; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if ((nx >= 0 && nx < n) && (ny >= 0 && ny < n) && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution() {

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0;
                    BFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Island main = new Island();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        map = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        main.solution();
        System.out.println(answer);
    }
}