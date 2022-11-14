package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        // TODO Auto-generated method stub
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }


}

public class Wedding {

    int solution(ArrayList<Time> arr) {
        Collections.sort(arr);
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for (Time ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }



        return answer;
    }

    public static void main(String[] args) {
        Wedding main = new Wedding();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i=0; i<n; ++i) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            arr.add(new Time(s, 's'));
            arr.add(new Time(e, 'e'));
        }


        System.out.println(main.solution(arr));


    }

}
