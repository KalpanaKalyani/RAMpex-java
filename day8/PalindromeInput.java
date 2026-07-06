package day8;

import java.util.Scanner;

public class PalindromeInput{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String name = sc.nextLine();

        System.out.println(isPalindrome(name));

        sc.close();
    }

    public static boolean isPalindrome(String name) {

        int start = 0;
        int end = name.length() - 1;

        while (start < end) {

            if (name.charAt(start) != name.charAt(end)) {
               return false;
            }

            start++;
            end--;
        }

        return true;
    }
}