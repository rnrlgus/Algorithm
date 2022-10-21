package sorting_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Joker {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; ++i) {
            if (arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Joker main = new Joker();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        for (Integer x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
