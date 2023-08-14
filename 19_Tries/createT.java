
import java.util.*;

public class createT {
    static class Node {
        Node children[] = new Node[26];
        Boolean eow = false;

        // create an constructor..
        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {// O(L),L=length of largest word
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    //Serarch fun ...
    public static boolean serach(String key){
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow = true;
    }

    //Word Break..
    public static boolean wordBreak(String key){
        //base cae..
        if(key.length() == 0){
            return true;
        }
        for(int i =1 ;i<= key.length();i++){
            if(serach(key.substring(0, i)) && wordBreak( key.substring(i))){
                return true;
            }
           
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "their", "any", "thee" };
        // for (int level = 0; level < words.length; level++) {
        //     insert(words[level]);
        // }

        String arr[]={"i" , "like" , "sam" , "samsung" ,"mobile" , "ice"};
        for(int i = 0;i<arr.length ;i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
        // System.out.println(serach("any"));
        // System.out.println(serach("there"));
        // System.out.println(serach("thor"));

    }
}
