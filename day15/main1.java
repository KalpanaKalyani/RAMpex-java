package day15;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name="";
        System.out.println("Enter a id:");
        int id=0;
        int[] age={};
        try{
            name=sc.nextLine();
            id=sc.nextInt();
            System.out.println(age[10]);
        }catch(InputMismatchException e){
            System.out.println(e);
        }catch(MissingFormatArgumentException e){
            System.out.println(e);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
