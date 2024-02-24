public class reverse_num {
    public static void main(String[] args) {
        int num=12345;
        while(num>0)
        {
            int last_dig=num%10;
            System.out.print(last_dig);
            num=num/10;
        }
        System.out.println();
    }
    
}
