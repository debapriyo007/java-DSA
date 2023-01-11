public class palindrome {

    public static boolean check_palendrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("The" +" "+ str + " " + "is not Palindrom!");
                return false;
            }
        }
        System.out.println( str + " is Palindrom!");
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        check_palendrom(str);

    }
}
