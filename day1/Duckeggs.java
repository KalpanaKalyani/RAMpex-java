package day1;
import java.util.Scanner;
public class Duckeggs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of.Ducks:");
        int a=sc.nextInt();
        System.out.println("Time:");
        int b=sc.nextInt();
        int eggs=a*b/5;
        System.out.println("NO of Eggs:"+eggs);
    }
}
