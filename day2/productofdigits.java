package day2;

import java.util.Scanner;
public class productofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int prod=1;
        while(a>0){
            int pop=a%10;
            a=a/10;
            prod=prod*pop;
        }
        System.out.println("The product of digits is:"+prod);
    }
}
