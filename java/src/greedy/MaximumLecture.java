package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        // TODO Auto-generated method stub
        return o.time - this.time;
    }


}

public class MaximumLecture {

    static int max = Integer.MIN_VALUE;
    static int n;

    int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        Collections.sort(arr);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int j=0;
        for (int i=max; i>=1; --i) {
            for (; j<n; ++j) {
                if(arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        MaximumLecture main = new MaximumLecture();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i=0; i<n; ++i) {
            int m = scan.nextInt();
            int d = scan.nextInt();
            arr.add(new Lecture(m, d));
            if (max < d) max = d;
        }


        System.out.println(main.solution(arr));


    }

}
