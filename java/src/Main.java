import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; ++i) {
            int tmp = answer.get(i-1) + answer.get(i-2);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        ArrayList<Integer> result = main.solution(n);
        for (Integer integer : result) {
            System.out.print(integer + " ");

        }
    }
}