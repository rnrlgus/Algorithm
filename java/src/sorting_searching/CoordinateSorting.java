package sorting_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x == p.x) return this.y - p.y;
        else return this.x - p.x;
    }

}
public class CoordinateSorting  {

//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//
//
//
//        return answer;
//    }

    public static void main(String[] args) {
        CoordinateSorting main = new CoordinateSorting();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }

    }
}
