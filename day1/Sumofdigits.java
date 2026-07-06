package day1;
import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
            int pop=a%10;
            sum=sum+pop;
            a=a/10;
        }
        System.out.println("No of integers:"+sum);
    }
}

