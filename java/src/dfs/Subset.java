package dfs;

public class Subset {

    static int n;
    static int[] check;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; ++i) {
                if (check[i] == 1) {
                    tmp += i + " ";
                }
            }

            if (tmp.length() > 0) {
                System.out.println(tmp);
            }

        } else {
            check[L] = 1; // 사용
            DFS(L+1); // left
            check[L] = 0; // 사용 x
            DFS(L+1); // right
        }

    }

    public static void main(String[] args) {
        Subset main = new Subset();

        n = 3;
        check = new int[n + 1];
        main.DFS(1);
    }
}