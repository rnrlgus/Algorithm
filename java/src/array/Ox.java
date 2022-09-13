package array;

import java.util.Scanner;

public class Ox {

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
        Ox main = new Ox();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}