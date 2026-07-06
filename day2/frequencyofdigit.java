package day2;

import java.util.Scanner;
public class frequencyofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a digit:");
        int b = sc.nextInt();
        int count=0;
        while (a > 0) {
            int pop = a % 10;
            if (pop == b) {
                count++;
            }
            a= a / 10;
        }
        System.out.println("the frequent no is:"+count);
    }
}
