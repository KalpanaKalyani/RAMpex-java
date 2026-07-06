package day13;
import java.util.*;
public class Example2 {
    public static void main(String[]  args){
        List<Object> num=new ArrayList<>();
        num.add("A");
        num.add("B");
        num.add("C");
        num.add("D");
        num.add("E");
        num.add("A");
        num.add("B");
        num.addFirst("Alphabets");
        num.addLast("Complete");
        List<Object> n=Arrays.asList("English","Fruits",44,34,5,4,23,56);
        num.addAll(0,num);
        System.out.println(num);
        num.remove(2);
        System.out.println(num);
        List<Object> l=Arrays.asList("Alphabets","Complete");
        num.removeAll(l);
        System.out.println(num);
        List<Object> j=Arrays.asList("A","B");
        num.retainAll(j);
        System.out.println(num);

    }
}
