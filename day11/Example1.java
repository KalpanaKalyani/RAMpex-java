package day11;
class Animal{
    void makesound(){
        System.out.println("Makesound");
    }
    void issleep(){

    }
}
class Dog extends Animal{
    String name;
    Dog(String name){
        this.name=name;
    }
    void bark(){
        System.out.println(name+" Barking");
    }
    void issleep(){
        System.out.println(name+" is sleeping");
    }
}
class Cat extends Animal{
    String name;
    Cat(String name){
        this.name=name;
    }
    void meow(){
        System.out.println(name+" is Sleeping");
    }
    void issleep(){
        System.out.println(name+" is meowing");
    }
}
public class Example1 {
    public static void main(String[] args){
     Dog d1=new Dog("Jack");
     Cat c1=new Cat("kalki");
       d1.bark();
        d1.issleep();
        c1.meow();
        c1.issleep();
    }
}
