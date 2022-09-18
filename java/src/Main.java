import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer=0;
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += arr[i];
            answer = sum;
        }

        for (int i = k; i < n; ++i) {
            sum += arr[i];
            sum -= arr[i - k];
            if (sum > answer) {
                answer = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}