public class PrimeInRange {

    public static void primeInRange(int low, int high) {

        while (low <= high) {
            boolean isPrime = true;

            for (int i = 2; i <= low / 2; ++i) {
                if (low % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && low != 1) {
                System.out.println(low);
            }
            ++low;
        }

    }
    public static void main(String[] args) {

        primeInRange(1, 50);
    }
}
