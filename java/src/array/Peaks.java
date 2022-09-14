package array;

import java.util.Scanner;

public class Peaks {

    // 상 우 하 좌
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                boolean flag = true;
                for (int k = 0; k < 4; ++k) { // 상 우 하 좌 탐색
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Peaks main = new Peaks();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        System.out.println(main.solution(n, map));
    }
}