package day1;
import java.util.Scanner;
public class rev_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=sc.nextInt();
        int rev=0;
        while(a>0){
            int pop=a%10;
            a=a/10;
            rev=rev*10+pop;
        }
        System.out.println(rev);
    }
}

