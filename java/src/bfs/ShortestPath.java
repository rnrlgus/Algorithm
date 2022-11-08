package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPath {

    static int[][] map = new int[7][7];
    static int[][] distance = new int[7][7];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0,0));
        map[0][0] = 1;

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if ((nx >= 0 && nx <= 6) && (ny >= 0 && ny <= 6) && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[tmp.x][tmp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        ShortestPath main = new ShortestPath();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                map[i][j] = scan.nextInt();
            }
        }
        main.BFS(0, 0);

        if (distance[6][6] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(distance[6][6]);
        }
    }
}