package day10;
class A{
    private int a;
    private int b;
    public int getA(int a){
        return a;
    }
    public int getB(int b){
        return b;
    }
    public int setA(int a){
        if(a>10){
            this.a=a;
        }
        else{
            System.out.println("Invalid input");
        }
        return 0;
    }
    public void setB(int b){
        this.b=b;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
public class Encaps {
    public static void main(String[] args){
        A a1=new A();
        a1.setA(10);
        a1.setB(20);
        a1.display();
    }
}
