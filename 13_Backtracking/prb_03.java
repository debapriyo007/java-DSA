public class prb_03 {
         
    public static void findPermutation(String str, String ans){
        if(str.length()==0){  //this is our base case..
            System.out.println(ans);
            return;
        }
        //perform recursion...

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i)+str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }


    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
    
}
