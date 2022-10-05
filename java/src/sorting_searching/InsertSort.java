package sorting_searching;

import java.util.Scanner;


public class InsertSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; ++i) {
            int j;
            int tmp = arr[i];
            for (j = i - 1; j >= 0; --j) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertSort main = new InsertSort();
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
