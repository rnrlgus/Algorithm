import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] arr, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 0; i < arr.length-1; ++i) {
            if (arr[i] < arr[i + 1]) {
                answer.add(arr[i + 1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> result = main.solution(arr, n);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}