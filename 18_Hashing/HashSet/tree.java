import java.util.*;

public class tree {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bottle");
        ts.add("phone");
        ts.add("sope");
        ts.add("apple");
        ts.add("mac");

        for(String obj : ts){
            System.out.println(obj);
            //The output is printing in sorted order..
        }
        

    }
}
