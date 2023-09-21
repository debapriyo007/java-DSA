public class sub_string {

    //Substring function...

    public static String find_out_sub(String str, int si, int ei)
    {
        String  substr="";
        for(int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        
        String str="HelloWorld";

        // System.out.println(find_out_sub(str, 0, 5));
        
        System.out.println( str.substring(0,5));  //----Using this function we easily find out substring.. 
    }
}
