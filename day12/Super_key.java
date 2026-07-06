package day12;
class A{
    void display(){
        System.out.println("The World");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("The wall");
    }
}
public class Super_key {
    public static void main(String[] args){
        B b=new B();
        b.display();
    }
}
