package day4homework;
import java.util.Scanner;

public class mutiplicationtable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}
