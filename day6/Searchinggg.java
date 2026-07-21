package day6;

public class Searchinggg {
    public static void main(String[] args){
        int[] arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key=4;
        int index=-1;
        for(int num:arr){
            if(num==key){
                index=num;
            }
        }
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println(index);
        }
    }
}
