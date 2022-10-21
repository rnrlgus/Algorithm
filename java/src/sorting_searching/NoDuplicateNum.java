package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;


public class NoDuplicateNum {
    
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n-1; ++i) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        NoDuplicateNum main = new NoDuplicateNum();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, arr));;

    }
}
