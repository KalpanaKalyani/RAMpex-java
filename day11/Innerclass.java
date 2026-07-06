package day11;
class Ex{
   void display(){
       System.out.println("Display the outer class");
   }
   class a{
       void display(){
           System.out.println("The inner class");
       }
   }
}
public class Innerclass {
    public static void main(String[] args){
        Ex obj=new Ex();
        Ex.a c= obj.new a();
        obj.display();
        c.display();
    }
}
