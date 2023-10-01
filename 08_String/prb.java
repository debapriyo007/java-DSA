public class prb {
    public static String getFre(String str){
        int fre[]= new int[26];
        for(char ch : str.toCharArray()){
            fre[ch-'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        char c = 'a';
        for(int i : fre){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    
    }
    public static void main(String[] args) {
        String strs = "aabbc";
        System.out.println(getFre(strs));
    }
}
