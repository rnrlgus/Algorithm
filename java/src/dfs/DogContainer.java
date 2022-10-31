package dfs;

import java.util.Scanner;

public class DogContainer {

    static int c, n;
    static int[] arr;

    static int answer = 0;


    public void DFS(int p, int sum) {
        if (p == n) {
            if (sum > answer && sum <= c) {
                answer = sum;
            }
        } else {
            DFS(p+1, sum + arr[p]);
            DFS(p+1, sum);
        }

     }

    public static void main(String[] args) {
        DogContainer main = new DogContainer();
        Scanner scan = new Scanner(System.in);

        c = scan.nextInt();
        n = scan.nextInt();


        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        main.DFS(0, 0);
        System.out.println(answer);


    }
}