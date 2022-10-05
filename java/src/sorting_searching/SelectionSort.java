package sorting_searching;

import java.util.Scanner;


public class SelectionSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; ++i) {
            int idx = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort main = new SelectionSort();
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
