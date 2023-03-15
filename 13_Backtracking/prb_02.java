public class prb_02 {

    public static void subSet(String str, String ans, int i){
        //base case...
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{

                System.out.println(ans);
            }
            return;
        }

        //yes...
        subSet(str, ans+str.charAt(i), i+1);
        subSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSet(str, "", 0);
    }
    
}
