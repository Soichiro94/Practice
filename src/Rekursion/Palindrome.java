package Rekursion;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindromRecursive("x"));
        System.out.println(isPalindromRecursive("aa"));
        System.out.println(isPalindromRecursive("rar"));
        System.out.println(isPalindromRecursive("otto"));
        System.out.println(isPalindromRecursive("rom"));
        System.out.println(isPalindromRecursive("moabom"));

    }

    static boolean isPalindromRecursive(String string) {
        if (string.length() <= 1) {
            return true;
        }
        if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }
        else {
            return isPalindromRecursive(string.substring(1, string.length()-1));
        }
    }
}


