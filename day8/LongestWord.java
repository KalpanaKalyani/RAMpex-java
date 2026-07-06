package day8;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1=sc.nextLine();
        System.out.println(Longest(s1));
    }
    public static String Longest(String s1){
        String longest="";
        String[] str1=s1.split(" ");
        for(String word:str1){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        return longest;
    }
}
