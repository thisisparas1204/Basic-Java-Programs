public class IsPrime {

    public static boolean checkPrime(int n) {
        boolean isPrime = true;

        if (n == 1)
            return false;

        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(3));
        System.out.println(checkPrime(7));
        System.out.println(checkPrime(9));
    }
}
