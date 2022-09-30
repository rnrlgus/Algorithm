import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        ArrayList<Integer> al = new ArrayList<>();
        int p = 0;
        while(p< arr.length) al.add(arr[p++]); // 1 2 3 4 5

        while (p < arr.length-1) al.add(arr[++p]); // 2 3 4 5

        for (int x : al) System.out.print(x + " ");



    }
}
