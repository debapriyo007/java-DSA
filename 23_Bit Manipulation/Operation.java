public class Operation {

    //Get i'th Bit.
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //Set i'th Bit.
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //Clear i'th Bit.
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        
        System.out.println(getIthBit(10, 2)); //1010 ans will be 0 
        System.out.println(getIthBit(7, 2));

        System.out.println(setIthBit(10, 2)); //ans 14

    }
}
