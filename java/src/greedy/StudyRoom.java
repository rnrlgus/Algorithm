package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {
    public int s, e;
    Time2(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time2 o) {
        // TODO Auto-generated method stub
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }

}

public class StudyRoom {

    int solution(ArrayList<Time2> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);
        int endTime = 0;

        for(Time2 ob : arr) {
            if (ob.s >= endTime) {
                cnt++;
                endTime = ob.e;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        StudyRoom main = new StudyRoom();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] start = new int[n];
        int[] end = new int [n];

        ArrayList<Time2> arr = new ArrayList<>();
        for (int i=0; i<n; ++i) {
            int s = scan.nextInt();
            int e = scan.nextInt();

            arr.add(new Time2(s, e));
        }

        System.out.println(main.solution(arr, n));


    }

}
