package haspMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hash_SlidingWindow {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

//        7 4
//        20 12 20 10 23 17 10

        for (int i = 0; i< k - 1; ++i) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int start = 0;
        for (int end = k - 1; end < n; ++end) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[start], hm.get(arr[start]) - 1);
            if (hm.get(arr[start]) == 0) hm.remove(arr[start]);
            start++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Hash_SlidingWindow main = new Hash_SlidingWindow();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        for (int x : main.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}