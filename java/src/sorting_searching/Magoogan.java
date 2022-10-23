package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class Magoogan {
    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int start = 1, end = arr[n-1];

        while (start <= end) {
            int mid = (start + end)/2;
            int ep = 0, cnt = 1;

            for (int i = 1; i < n; ++i) {
                if (arr[i] - arr[ep] >= mid) {
                    cnt += 1;
                    ep = i;
                }
            }

//            System.out.println(start + " " + end + " " +mid + " " + cnt);

            if (cnt >= m) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Magoogan main = new Magoogan();
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
