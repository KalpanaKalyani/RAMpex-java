package day5;

public class MaxMinArray {
    public static void main(String[] args){
        int[] array=new int[]{10,20,90,40,50};
        int max;
        int min;
        max=min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Largest number:"+max);
        System.out.println("Smallest number:"+min);
    }
}
