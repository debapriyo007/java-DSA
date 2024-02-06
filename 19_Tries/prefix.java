public class prefix {

    static class Node{
        Node[] children = new Node [26];
        boolean eow = false;
        int fre;
        
        public Node(){
               for(int i = 0 ;i<children.length ;i++){
                children[i] = null;
                 
               }
               fre = 1; //for any new node frequency will be 1.
        }
    }
    public static Node root = new Node();
    public static void main(String[] args) {
        String arr[] ={"zebra" ,"dog" , "duck" , "dove"}; //create array of strings
    }
}
