package day7;

public class Bubblesort {
    public static void main(String[] args){
        int[] arr={1,3,2,6,8,1,5,9};
        Bubblesort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void Bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
