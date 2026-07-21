package day15;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=0;
        try{
            n=sc.nextInt();
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        System.out.println(n);
    }
}

