package day13;
import java.util.*;
public class Collectins {
    public static void main(String[] args){
        List<Object> name=new ArrayList<>();
        name.add("A");
        name.add(60);
        name.add("B");
        name.add(20);
        name.add("D");
        name.add(77);
        name.addFirst("C");
        name.addLast("V");
        name.addLast("Kim");
        name.remove("K");
        List<Object> n=Arrays.asList("E","F","G");
         name.addAll(n);
             System.out.print(name);
    }
}
