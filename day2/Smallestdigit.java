package day2;

import java.util.Scanner;
public class Smallestdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int small=10;
        while(a>0){
            int pop=a%10;
            if(small>pop){
                small=pop;
            }
            a=a/10;
        }
        System.out.println("Smallest digit is:"+small);
    }
}
