public class some_fun {

    // Print letter fun

    public static void print_Letter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // String fullName= "Debapriyo Das";
        // System.out.println("My name length is:" + fullName.length());
        // //<------------find out charecter length ..........

        String firstName = "SNOOP";
        String lastName = "DOGG";
        String fullName = firstName + " " + lastName; // <-------This is called concatenation.....
        System.out.println(fullName);

        System.out.println(fullName.charAt(0)); // <-------- Find out the charecter with the index base....

        print_Letter(fullName);                        //<--------- print each letter......

    }

}
