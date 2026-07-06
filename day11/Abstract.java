package day11;
abstract class Er{
    abstract void run();
    abstract void display();
    void display2(){
        System.out.println("Heee");
    }
}
class Ee extends Er{
    void run(){
        System.out.println("Hello world");
    }
    void display(){
        System.out.println("Aagayam");
    }
}
public class Abstract {
    public static void main(String[] args){
         Ee a =new Ee();
         a.run();
         a.display();
    }
}
