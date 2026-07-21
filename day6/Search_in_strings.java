package day6;

public class Search_in_strings {

    public static void main(String[] args){
        String name="hello world";
        char key='o';
        char[] arr=name.toCharArray();
        System.out.println(search(arr,key));
    }
    static int search(char[] arr,char key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(arr[i]);
                return i;
            }
        }
        return -1;
    }
}
