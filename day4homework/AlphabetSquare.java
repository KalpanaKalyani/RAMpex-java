package day4homework;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
