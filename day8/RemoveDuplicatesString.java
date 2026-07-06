package day8;

import java.util.Scanner;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;

            // Check previous characters
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}