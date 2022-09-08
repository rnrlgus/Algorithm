package array;

import java.util.Scanner;

public class RockScissorsPaper {

    public String[] solution(int[] arr1, int[] arr2, int n) {
        String[] answer = new String[n];
        for (int i = 0; i < n; ++i) {
            if (arr1[i] == arr2[i]) { // 비길 경우
                answer[i] = "D";
            } else if (arr1[i] == 1 && arr2[i] == 2) {
                answer[i] = "B";
            } else if (arr1[i] == 2 && arr2[i] == 3) {
                answer[i] = "B";
            } else if (arr1[i] == 3 && arr2[i] == 1) {
                answer[i] = "B";
            } else {
                answer[i] = "A";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RockScissorsPaper main = new RockScissorsPaper();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; ++i) {
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; ++i) {
            arr2[i] = scan.nextInt();
        }

        String[] result = main.solution(arr1, arr2, n);
        for (String x : result) {
            System.out.println(x);
        }
    }
}