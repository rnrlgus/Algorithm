package sorting_searching;

import java.util.Scanner;

public class MusicVideo {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int start = arr[n - 1];

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        int end = sum;

        while (start <= end) {
            int cnt = 1, stack = 0;
            int mid = (start + end)/2;
            for (int i = 0; i < n; ++i) {
                stack += arr[i];
                if (stack > mid) {
                    cnt += 1;
                    stack = arr[i];
                }
            }
            // System.out.println(start + " " + end + " " +mid + " " + cnt);

            if (cnt > m) {
                start = mid + 1;
            } else {
                answer = mid;
                end = mid -1;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MusicVideo main = new MusicVideo();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        System.out.println(main.solution(n, m, arr));

    }
}
