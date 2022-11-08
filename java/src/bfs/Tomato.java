package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Tomato {

    static int m, n;
    static int[][] map, distance;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static boolean flag = true;



    public void BFS() {
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (map[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if ((nx >= 0 && nx < m) && (ny >= 0 && ny < n) && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[tmp.x][tmp.y] + 1;
                }
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (map[i][j] == 0) {
                    flag = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        Tomato main = new Tomato();
        Scanner scan = new Scanner(System.in);

        m = scan.nextInt();
        n = scan.nextInt();
        map = new int[m][n];
        distance = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        main.BFS();

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (distance[i][j] > answer) {
                    answer = distance[i][j];
                }
            }
        }

        if (flag == true) System.out.println(answer);
        else System.out.println(-1);
    }
}