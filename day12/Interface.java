package day12;


interface Ani {
    default void display(){
        System.out.println("The File");
    }
}
class got implements Ani{
    void display2(){
        System.out.println("Thee eee");
    }
}
class tac implements Ani {
    void display2(){
        System.out.println("The eyes");
    }
}
public class Interface {
    public static void main(String[] args){
        got a=new got();
        tac c=new tac();
        a.display();
        a.display2();
        c.display2();
    }
}
