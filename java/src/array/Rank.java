package array;

import java.util.Scanner;

public class Rank {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; ++i) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt += 1;
                }
                answer[i] = cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Rank main = new Rank();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        int[] result = main.solution(n, arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}