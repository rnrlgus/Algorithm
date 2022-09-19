import java.util.Scanner;

public class SubSequences {

    public int solution(int n, int k, int[] arr) {
        int answer=0, sum=0, start=0;

//        for (int end = 0; end < n; ++end) {
//            sum += arr[end];
//            if (sum == k) answer += 1;
//            while (sum >= k) {
//                sum -= arr[start++];
//                if (sum == k) answer++;
//            }
//        }

        for (int end = 0; end < n; ++end) {
            sum += arr[end];

            while (sum > k) {
//                sum -= arr[start];
//                start += 1;
                sum -= arr[start++];
            }

            if (sum == k) answer += 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        SubSequences main = new SubSequences();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}