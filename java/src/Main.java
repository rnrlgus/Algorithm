import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; ++i) { // 학생1 번호
            for (int j = 1; j <= n; ++j) { // 학생2 번호
                int cnt = 0;
                for (int k = 0; k < m; ++k) { // 테스트 횟수
                    int idxI=0;
                    int idxJ=0;
                    for (int s = 0; s < n; ++s) { // i번, j번 학생 인덱스 체크 후 멘토멘티 성립 조건 확인
                        if (arr[k][s] == i) {
                            idxI = s;
                        }
                        if (arr[k][s] == j) {
                            idxJ = s;
                        }
                    }
                    if (idxI < idxJ) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt(); // 학생 수
        int m = scan.nextInt(); // 테스트 수
        int[][] map = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                map[i][j] = scan.nextInt();
            }
        }

        System.out.println(main.solution(n, m, map));
    }
}