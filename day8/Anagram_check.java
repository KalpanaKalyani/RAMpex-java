package day8;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 1st string:");
        String s1=sc.nextLine();
        System.out.println("Enter a 2nd string:");
        String s2=sc.nextLine();
        System.out.println(Anagram(s1,s2));
    }
    public static boolean Anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1,arr2));
    }
}
