package day10;
class book1{
    String name;
    String author;
    public book1(String name,String author){
        this.name=name;
        this.author=author;
    }
    public book1(String name){
        this.name=name;
        this.author="null";
    }
    public book1(){
        this.name="null";
        this.author="null";
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
    }
}
public class Books{
    public static void main(String[] args){
        book1 b1=new book1("Kalpana","Kalyani");
        b1.display();
    }
}
