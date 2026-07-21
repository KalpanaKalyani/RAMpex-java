package day7;

public class Selectionsort {
    static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={64,25,12,22,11};
        Selectionsort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
