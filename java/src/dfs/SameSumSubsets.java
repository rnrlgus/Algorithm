package dfs;

import java.util.Scanner;

public class SameSumSubsets {

    static int n;
    static int[] check;
    static int[] arr;
    static String answer = "NO";

    static int tmp1, tmp2;

    public void DFS(int p) {
        if (p == n) {
            tmp1=tmp2=0;
            for (int i = 0; i < n; ++i) {
                if (check[i] == 1) tmp1 += arr[i];
                else tmp2 += arr[i];
            }
            if (tmp1 == tmp2){
                answer = "YES";
//                for (int x : check) {
//                    System.out.print(x + " ");
//                }
//                System.out.println();
//                System.out.println(tmp1 + " " + tmp2);
            }


        } else {
            check[p] = 1; // 사용
            DFS(p+1);
            check[p] = 0; // 사용x
            DFS(p+1);
        }

     }

    public static void main(String[] args) {
        SameSumSubsets main = new SameSumSubsets();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        check = new int[n];

        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        main.DFS(0);
        System.out.println(answer);


    }
}