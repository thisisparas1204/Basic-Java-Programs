public class Armstrong {

    public static boolean armstrong(int n) {
        int original = n;
        int number = 0;
        while (n != 0) {
            int remainder = n % 10;
            number += Math.pow(remainder, 3);
            n /= 10;
        }
        return original == number;
    }
    public static void main(String[] args) {

        System.out.println(armstrong(153));
        System.out.println(armstrong(370));
        System.out.println(armstrong(371));
        System.out.println(armstrong(372));
    }
}
