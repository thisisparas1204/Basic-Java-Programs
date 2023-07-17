public class Fibonacci {

    public static void fibonacci(int a, int b, int n) {
        for (int i = a; i < n; ++i) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {

        fibonacci(0, 1, 10);
    }
}
