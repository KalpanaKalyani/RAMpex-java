package day8;

public class StringEx {
    public static void main(String[] arg){
        String s="Abirami";
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String name1=new String(arr);
        System.out.println(name1);
    }
}
