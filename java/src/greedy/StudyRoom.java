package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        // TODO Auto-generated method stub
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }

}

public class StudyRoom {

    int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);
        int endTime = 0;

        for(Time ob : arr) {
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

        ArrayList<Time> arr = new ArrayList<>();
        for (int i=0; i<n; ++i) {
            int s = scan.nextInt();
            int e = scan.nextInt();

            arr.add(new Time(s, e));
        }

        System.out.println(main.solution(arr, n));


    }

}
