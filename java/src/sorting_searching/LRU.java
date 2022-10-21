package sorting_searching;

import java.util.Scanner;


public class LRU {

//    5 9
//    1 2 3 2 6 2 3 5 7

    public int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < s; ++i) {
                if (x == cache[i]) {
                    pos = i;

                    for (int j = i; j > 0; --j) {
                        cache[j] = cache[j - 1];
                    }
                    cache[0] = x;
                }
            }

            if (pos == -1) {
                for (int i = s-1; i > 0; --i) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        return cache;
    }

    public static void main(String[] args) {
        LRU main = new LRU();
        Scanner scan = new Scanner((System.in));

        int s = scan.nextInt();
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        int[] result = main.solution(s, n, arr);
        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}
