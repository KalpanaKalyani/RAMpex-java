package day11;
class A{
    A(){
        System.out.println("A is AA");
    }
    A(int a){
        System.out.println("AA");
    }
}
class B extends A{
    B(){
        super(5);
        System.out.println("BB");
    }
    B(int a){
        this();
        System.out.println("B is BB");
    }
}
public class Example {
    public static void main(String[] args){
        B b=new B();
    }
}
