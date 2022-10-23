package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;

        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            } else if (arr[mid] > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) /2;
        }
        return answer;
    }

    public static void main(String[] args) {
        BinarySearch main = new BinarySearch();
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
