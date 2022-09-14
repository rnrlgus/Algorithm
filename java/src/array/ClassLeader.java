package array;

import java.util.Scanner;

public class ClassLeader {

    public int solution(int n, int[][] arr) {
        int answer = 0;

        int[][] result = new int[n][n];
        int[] tmp = new int[n];


        for (int j = 0; j < 5; ++j) { // 학년별 반복
            for (int k = 0; k < n; ++k) { // 학생1
                for (int l = 0; l < n; ++l) { // 학생2
                    if (k != l && arr[k][j] == arr[l][j]) {
                        result[k][l] = 1;
                    }
                }
            }
        }

        int cnt;
        for (int i = 0; i < n; ++i) {
            cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (result[i][j] == 1) cnt++;
            }
            tmp[i] = cnt;
        }

        int maxIdx = 0;
        for (int i = 1; i < n; ++i) {
            if (tmp[i] > tmp[maxIdx]) {
                maxIdx = i;
            }
        }
        answer += maxIdx + 1;
        return answer;
    }

    public static void main(String[] args) {
        ClassLeader main = new ClassLeader();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[][] map = new int[n][5];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 5; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        System.out.println(main.solution(n, map));
    }
}