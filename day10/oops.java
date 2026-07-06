package day10;
class calculator{
    int a;
    int b;
    public calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c=a+b;
        System.out.println("Addition of 2 nos is: "+c);
    }
    public void sub(){
        int d=a-b;
        System.out.println("Subtraction of 2 nos is: "+d);
    }
}
public class oops {
    public static void main(String[] args){
        calculator cal1=new calculator(5,10);
        cal1.add();
        cal1.sub();
    }
}
