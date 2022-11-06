package dfs;

import java.util.Scanner;

public class Maze {

    static int cnt = 0;
    static int[][] map = new int[7][7];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

//    static int[][] visited = new int[7][7];
    void DFS(int x, int y) {
        if (x == 6 && y == 6) {
            cnt++;
        } else {
            for (int i = 0; i < 4; ++i) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if ((nx >= 0 && nx <= 6) && (ny >= 0 && ny <= 6)) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = 1;
                        DFS(nx, ny);
                        map[nx][ny] = 0;
                    }

                }

            }
        }

    }

    public static void main(String[] args) {
        Maze main = new Maze();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                map[i][j] = scan.nextInt();
            }
        }
        map[0][0] = 1;
        main.DFS(0, 0);

        System.out.println(cnt);
    }
}