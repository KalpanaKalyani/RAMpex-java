package day10;

class car{
    String model;
    String color;
    int year;
    public car(String model,String color,int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }
    public void display(){
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Year: "+year);
    }
}
public class Cars {
    public static void main(String[] args) {
        car c1 = new car("ROLLS ROYCE", "Red", 1999);
        car c2 = new car("BMW", "Black", 1990);
        c1.display();
        c2.display();
    }
}
