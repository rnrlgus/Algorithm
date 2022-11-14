import java.util.function.*;

class JavaTest {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(JavaTest::isAgeOver));
        System.out.println("under = " + count(JavaTest::isAgeUnder));
    }

    static boolean isAgeOver(int age) {
        return (age > 30);
    }

    static boolean isAgeUnder(int age) {
        return (age < 30);
    }

    static int count(Predicate<Integer> op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.test(arAge[i])) num++;
        }
        return num;
    }
}