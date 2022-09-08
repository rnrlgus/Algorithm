package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedPrimeNums {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int asd = reverse(arr[i]);
            if (isPrime(asd)) {
                answer.add(asd);
            }


        }

        return answer;
    }

    private int reverse(int arr) {
        String tmp = String.valueOf(arr);
        StringBuilder sb = new StringBuilder(tmp);
        sb = sb.reverse();
        String ttmp = sb.toString();
        int asd = Integer.parseInt(ttmp);
        return asd;
    }

    public boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 1; i < n+1; ++i) {
            if (n % i == 0) {
                cnt += 1;
            }
        }

        if (cnt == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ReversedPrimeNums main = new ReversedPrimeNums();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> result = main.solution(n, arr);
        for (Integer x : result) {
            System.out.print(x + " ");
        }
    }
}