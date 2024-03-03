package Strings;

/*
Implement a function that receives a number as a string, and checks if it's a palindrome
private static boolean isPalindrome(String str){}

Examples of expected behavior:
• isPalindrome("1") --> True
• isPalindrome("2222") --> True
• isPalindrome("12321") --> True
• isPalindrome("112321") --> False
*/

public class Is_Palindrome {
    private static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }

    public static void main(String[] args) {
        String strTrue = "ABCBA";
        String strFalse = "ABCFBA";

        System.out.println("strTrue = ABCBA -> " + isPalindrome(strTrue));
        System.out.println("strFalse = ABCFBA -> " + isPalindrome(strFalse));
    }
}
