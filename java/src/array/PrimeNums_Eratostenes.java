package array;

import java.util.Scanner;

public class PrimeNums_Eratostenes {

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = 0; j <= n; j = i + j) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNums_Eratostenes main = new PrimeNums_Eratostenes();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();

        System.out.println(main.solution(n));
    }
}