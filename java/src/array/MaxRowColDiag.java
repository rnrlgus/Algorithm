package array;

import java.util.Scanner;

public class MaxRowColDiag {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        int sum1, sum2;

        // 행,열
        for (int i = 0; i < n; ++i) {
            sum1 = sum2 = 0;

            for (int j = 0; j < n; ++j) {
                sum1 += arr[i][j]; // 행
                sum2 += arr[j][i]; // 열
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선
        sum1 = sum2 = 0;
        for (int i = 0; i < n; ++i) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        MaxRowColDiag main = new MaxRowColDiag();
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