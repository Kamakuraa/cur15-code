package ro.fasttrackit.temaCurs15.recursivitate;

public class Recursive {


    public static int sum(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static int evenSum(int n) {
        if ((n % 2 != 0) && (n>1)){
            return n;
        } else {
            return evenSum(n + 1) * n;
        }


    }

    public boolean isPal(String palindrome) {
        if (palindrome == null) {
            return false;
        }
        String reversed = reverse(palindrome);
        return palindrome.equals(reversed);
    }

    private String reverse(String palindrome) {
        if (palindrome == null) {
            return null;
        }
        if (palindrome.length() <= 1) {
            return palindrome;
        }
        return reverse(palindrome.substring(1)) + palindrome.charAt(0);
    }

    public static boolean checkPalindrome(String palindrome) {
        StringBuilder stringBuilder = new StringBuilder(palindrome);
        char[] contents = palindrome.toCharArray();

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            stringBuilder.append(contents[i]);

            String reversed = palindrome.toString();
            return palindrome.equals(reversed);
        }
        return false;
    }

    public int sumDigits(int n) {
        return (n - 1) % 9 + 1;

    }
}

