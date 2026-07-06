package day4;
import java.util.Scanner;
public class palindromefunction {
    public static void main(String[] args){
        int a=rev();
        System.out.println("The palindrome no is:"+a);
    }
    public static int rev(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0){
            int pop=n%10;
            n=n/10;
            rev=rev*10+pop;
        }
        if(rev==temp){
            return rev;
        }
        else{
            return 0;
        }
    }
}
