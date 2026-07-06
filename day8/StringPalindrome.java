package day8;

import java.io.Serializable;

public class StringPalindrome {
    public static void main(String[] args){
        String name="hello";
        System.out.println(StringPalindrome(name));
    }
    public static boolean StringPalindrome(String name){
        int start=0;
        int end=name.length()-1;
        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
