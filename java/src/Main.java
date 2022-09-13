import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                cnt = 0;
            } else {
                cnt += 1;
                answer += cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}