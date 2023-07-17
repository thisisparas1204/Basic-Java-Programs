public class Palindrome {

    public static boolean checkPalindrome(int n) {
        boolean isPalindrome = false;
        int original = n;
        int number = 0;

        while (n != 0) {
            int remainder = n % 10;
            number = number * 10 + remainder;
            n /= 10;
        }

        return original == number;
    }
    public static void main(String[] args) {

        System.out.println(checkPalindrome(121));
        System.out.println(checkPalindrome(1234321));
        System.out.println(checkPalindrome(3433));
    }
}
