package day10;
import java.util.Scanner;
class num{
    int a;
    int b;
    public void add(){
        System.out.println(a+b);
    }
}
public class Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        num n1=new num();
        System.out.println("Enter a 1st no:");
        n1.a=sc.nextInt();
        System.out.println("Enter a 2nd no:");
        n1.b=sc.nextInt();
        n1.add();
    }
}
