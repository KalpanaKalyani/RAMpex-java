package day3;

import java.util.Scanner;
public class Zero{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int k=sc.nextInt();
        while(k>0){
            int pop=k%10;
            if(pop==0){
                System.out.println("The number contains zero");
                break;
            }
            k=k/10;
        }
        if(k==0){
            System.out.println("The number contains no zeros");
        }
    }
}