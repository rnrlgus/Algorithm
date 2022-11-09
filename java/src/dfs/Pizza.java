package dfs;

import java.util.ArrayList;
import java.util.Scanner;

class Pizza {
    static int n, m;
    static int answer = Integer.MAX_VALUE;

    static int pNum;

    static int[] combination;

    static ArrayList<Point> house, pizza;
    static int[][] map;
    public void DFS(int L, int start){
        if (L == m) {
            int sum = 0;
            for (Point h : house) {
                int distance = Integer.MAX_VALUE;
                for (int i : combination) {
                    distance = Math.min(distance, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < pNum; ++i) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args){
        Pizza main = new Pizza();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();

        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = scan.nextInt();
                if (map[i][j] == 1) house.add(new Point(i, j));
                if (map[i][j] == 2) pizza.add(new Point(i, j));
            }
        }

        pNum = pizza.size();
        combination = new int[m];

        main.DFS(0, 0);
        System.out.println(answer);


    }
}