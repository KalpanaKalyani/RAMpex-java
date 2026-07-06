package day2;

import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int sum=0;
        while(a>0){
            int pop=a%10;
            a=a/10;
            sum=sum+pop;
        }
        System.out.println("Sum of no is: "+sum);
    }
}
