package day3;

import java.util.Scanner;
public class demo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=sc.nextInt();
       System.out.println("Enter a checking no:");
       int k=sc.nextInt();
       int count=0;
       while(a>0){
           int pop=a%10;
           if(k==pop){
               count++;
           }
           a=a/10;
       }
       System.out.println("No:"+count);
    }
}
