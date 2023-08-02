import java.util.*;

public class lhs {
    public static void main(String[] args) {
       LinkedHashSet<String> lhs = new LinkedHashSet<>();
       
       lhs.add("ram");
       lhs.add("shyam");
       lhs.add("jadu");
       lhs.add("madhu");

       lhs.remove("shyam");
       for(String name : lhs){
        System.out.println(name);
       }
    }
}
