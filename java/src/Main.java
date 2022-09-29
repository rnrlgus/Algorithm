import java.util.*;

public class Main {

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < k-1; ++i) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer =  queue.peek();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(main.solution(n, k));
    }
}