package twoPointer_slidingWindow;

import java.util.Scanner;

public class SumNums {

    public int solution(int n) {
        int answer = 0;
        int start = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; ++i) {
            arr[i] = i + 1;
        }

        for (int end = 0; end < m; ++end) {
            sum += arr[end];

            while (sum > n) {
                sum -= arr[start++];
            }

            if (sum == n) answer++;

        }


        return answer;
    }

    public static void main(String[] args) {
        SumNums main = new SumNums();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        System.out.println(main.solution(n));
    }
}