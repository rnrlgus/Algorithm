
import java.util.*;

public class Main  {

    static int n;
    static int[] arr;
    static int total;
    static String answer = "NO";
    boolean flag = false;


    public void DFS(int p, int sum) {
        if(flag) return;

        if (p == n) {
            if ((total-sum)== sum) {
                answer = "YES";
                flag = true;
                System.out.print(sum);
            }

        } else {
            DFS(p+1, sum+arr[p]);
            DFS(p+1, sum);
        }
     }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
            total += arr[i];
        }

        main.DFS(0, 0);
        System.out.println(answer);


    }
}