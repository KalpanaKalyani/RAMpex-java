package day4;

import javax.print.DocFlavor;

public class patternprint {
    public static void main(String[] args){
        int n=10;
        int m=10;
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
