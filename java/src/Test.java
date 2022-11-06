import java.util.ArrayList;

public class Test {
    public static void divide(int a,int b) throws ArithmeticException {
        if(b==0) throw new ArithmeticException("0으로 나눌 수는 없다니까?");
        int c=a/b;
        System.out.println(c);
    }
    public static void main(String[] ar){
        int a=10;
        int b=0;

        divide(a,b);
    }
}
