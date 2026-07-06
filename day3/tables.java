package day3;
import java.util.Scanner;
public class tables{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+"*"+i+"="+a*i);
            i++;
        }
    }
}
