package twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommon {

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindCommon main = new FindCommon();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; ++i) {
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; ++i) {
            arr2[i] = scan.nextInt();
        }

        for (int x : main.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}