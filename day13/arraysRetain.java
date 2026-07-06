package day13;
import java.util.*;
public class arraysRetain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>(Arrays.asList(11,2,3,4,55,66,78));
        list.removeIf( n->n%2==0);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        List<String> list1=new ArrayList<>(Arrays.asList("A","B","C","A","D"));
        String n=list1.get(0);
        System.out.println(n);
        int s=list1.indexOf("A");
        System.out.println(s);
        int n1=list1.lastIndexOf("A");
        System.out.println(n1);
        System.out.println("Enter a Alphabet:");
        String str=sc.nextLine();
        boolean itas=list1.contains(str);
        System.out.println(itas);
        boolean mt=list1.isEmpty();
        System.out.println(mt);
        int size=list1.size();
        System.out.println(size);
    }
}
