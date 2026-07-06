package day5;
import java.util.Scanner;
public class AverageArr {
    public static void main(String[] args){
        int[] array=new int[]{10,20,30,40,50};
       int sum=0;
       float avg;
       for(int num:array){
           sum+=num;
       }
       avg=sum/array.length;
       System.out.println(sum);
       System.out.println(avg);
    }
}



