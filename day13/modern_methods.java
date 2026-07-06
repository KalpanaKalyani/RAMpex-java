package day13;
import java.util.*;
public class modern_methods {
    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("A","B","C","D"));
        list.set(1,"bb");
        list.add(2,"B");
        System.out.println(list);
        list.replaceAll(s -> s.toUpperCase());
        list.replaceAll(s -> s.toLowerCase());
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
