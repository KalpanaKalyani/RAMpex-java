package day5;

public class ReverseArr {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int temp=0;
        int c=0;
        for(int i=0;i<4;i++){
            for(int j=3;j>=0;j--){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                c=arr[j];
            }
        }
        System.out.println("The reversed no is:"+c);
    }
}
