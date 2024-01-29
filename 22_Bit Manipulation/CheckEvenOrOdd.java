public class CheckEvenOrOdd {

    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //Even Number case.
            System.out.println("The number "+ n + " is EVEN");
        }else{
            System.out.println("The number "+ n + " is ODD!!");
        }
    }
    
    public static void main(String[] args) {
        /*
         * If the number is ODD  -> LSB  1
                            EVEN -> LSB  0
         */

         OddEven(3);
         OddEven(11);
         OddEven(4);
    }
}
