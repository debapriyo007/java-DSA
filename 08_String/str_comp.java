public class str_comp {
    public static void main(String[] args) {

        String s1 = "Raftaar";

        String s2 = "Raftaar";
        String s3 = new String("Raftaar");

        if (s1 == s2) {
            System.out.println("Strings are same.");
        } else {
            System.out.println("String are not same!");

        }

   /*----When we have to check two string according to their value we don't use "=="
         we have to use .equals fun..---------------.*/

        // if (s1 == s3) 
        if(s1.equals(s3)){
            System.out.println("Strings are same.");
        } else {
            System.out.println("String are not same!");

        } 

    }

}
