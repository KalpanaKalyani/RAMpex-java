package day13;
import java.util.*;
public class arrayremove {
    public static void main(String[] args){
        List<Object> n=new ArrayList<>();
        n.add("a");
        n.add("b");
        n.add("c");
        n.add("d");
        n.add("e");
        n.add("f");
        n.remove(3);
        n.remove("f");
        List<Object> nn=Arrays.asList("a","b");
        n.removeAll(nn);
        System.out.println(n);
    }
}
