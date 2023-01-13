
//This code is collected from Internet..
//https://pencilprogrammer.com ›


public class uppercase2 {
    public static void main(String[] args) {
	    String str = "pencil programmer";
    
	    //Split sentence into words
	    String words[]=str.split("\\s");
        String newString ="";
        
        for(String w: words){
            String first = w.substring(0,1);      //First Letter
            String rest = w.substring(1);         //Rest of the letters
        
            //Concatenete and reassign after 
            //converting the first letter to uppercase
            newString+=first.toUpperCase()+ rest+ " ";  
        }  
    
        //trim to remove the last redundant blank space
        System.out.println(newString.trim());
	}
    
}
