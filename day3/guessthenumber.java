package day3;

import java.util.Random;
import java.util.Scanner;
public class guessthenumber {
    public static void main(String[] args){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int key=rand.nextInt(100);
        int guess;
        do{
            System.out.println("Enter a no:");
            guess=sc.nextInt();
            if(guess>key){
                System.out.println(guess+" is to high");
            }
            else if(guess<key){
                System.out.println(guess+" is too low");
            }
        }while(guess!=key);
        System.out.println("Key is found");
    }
}
