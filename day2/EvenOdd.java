package day2;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int c=0;
        int b=0;
        while(a>0){
            int pop=a%10;
            if(pop%2==0){
                c++;
            }else{
                b++;
            }
            a=a/10;
        }
        System.out.println("Even numbers:"+c);
        System.out.println("Odd numbers:"+b);
    }
}
