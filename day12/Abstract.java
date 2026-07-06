package day12;
abstract class computer{
    void display(){
        System.out.println("Hello World");
    }
}
abstract class laptop extends computer{
    void display(){
        super.display();
        System.out.println("Laptop");
    }
}
class vivo extends laptop{

}
class desktop extends computer{
    void display(){
        super.display();
        System.out.println("Desktop");
    }
}
public class Abstract {
    public static void main(String[] args){
        computer c1=new desktop();
        c1.display();
    }
}
