package array;

import java.util.Scanner;

public class VIsibleStds {

    public int solution(int[] arr, int n) {
        int answer = 1; // 맨앞놈 포함
        int max = arr[0];
        for (int i = 1; i < n; ++i) {
            if (max < arr[i]) {
                max = arr[i];
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        VIsibleStds main = new VIsibleStds();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(arr, n));

    }
}