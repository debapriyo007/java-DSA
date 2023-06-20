import java.util.*;
public class prb_06 {

    //is vaild fun..
    public static boolean isVaild(String str){
          //creating a stack..
          Stack<Character> s = new Stack<>();
          for(int i = 0 ;i<str.length();i++){
            char ch = str.charAt(i);

            //opening brackets..
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()== '(' && ch ==')') //-->() is pair form .
                || (s.peek() == '{' && ch =='}')//-->{} is pair form .
                || (s.peek()=='[' && ch ==']')){//-->[] is pair form .
                    s.pop();
                }else{
                    return false;
                }
            }
          }
          if(s.isEmpty()){
            return true;
          }else{
            return false;
          }
    }
    public static void main(String[] args) {
        String str = "{(()[]{})}";
        System.out.println(isVaild(str));
    }
}
