package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow_1 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int a, int b) {
        ch = new int[10001];
        ch[a] = 1; // 방문
        queue.offer(a);
        int L=0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; ++i) {
                int x = queue.poll();
                for (int j = 0; j < 3; ++j) {
                    int nx = x + dis[j];
                    if (nx == b) return L+1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindCow_1 main = new FindCow_1();
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();


        System.out.println(main.BFS(a, b));
    }
}