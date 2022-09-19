package twoPointer_slidingWindow;

import java.util.Scanner;

public class LongestOnes {

    public int solution(int n,int k,int[] arr) {
        int answer = 0, cnt = 0, start = 0;
        for (int end = 0; end < n; ++end) {
            if(arr[end] == 0) cnt++;
            while (cnt > k) {
                if (arr[start]==0) cnt--;
                start++;
            }
            answer = Math.max(answer, end - start + 1);
        }



        return answer;
    }

    public static void main(String[] args) {
        LongestOnes main = new LongestOnes();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}