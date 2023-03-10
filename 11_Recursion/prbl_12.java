

public class prbl_12 {

    public static void removeDuplicate(String str, int index, StringBuilder newstr, boolean map[]){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }

        char currCharecter = str.charAt(index);
        if(map[currCharecter-'a']== true){
            //duplicate
            removeDuplicate(str, index+1, newstr, map);
        }else{
            map[currCharecter -'a']= true;
            removeDuplicate(str, index, newstr.append(currCharecter), map);
        }
    }
    public static void main(String[] args) {
        
        String str = "debbaprriyoo";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
