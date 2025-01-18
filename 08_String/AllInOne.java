import java.util.*;

public class AllInOne{
	static void generateAllSubstrign(String str){
	    
	    int n = str.length();
	    for(int i = 0; i < n; i++) {
            String currSubString = "";
            for(int j = i; j < n; j++) {
                currSubString += str.charAt(j);
                System.out.println("SubString is : " + currSubString);
            }
        }
	}













	public static void main(String[] args) {
		
		
		String str = "debu";
		generateAllSubstrign(str);
	}
}