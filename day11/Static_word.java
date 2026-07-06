package day11;
class add1{
    public static int add(int a,int b){
        return a+b;
    }
}
public class Static_word {
    public static void main(String[] args){
        int add2=add1.add(30,40);
        System.out.println(add2);
    }
}
