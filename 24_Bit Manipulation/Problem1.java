public class Problem1 {
    public static void main(String[] args) {
        
        // System.out.println((5 & 6)); //output : 4 BINARY AND.
        System.out.println((5 | 6)); //BINARY OR OPERATOR.

        //XOR: Same bit XOR will be 0 and Different Bit XOR will be 1.
        /*
          0 ^ 0 = 0
          0 ^ 1 = 1
          1 ^ 0 = 1
          1^ 1 =  0  
        */
        System.out.println((5^6));

        //Binary Onace's Complement ~
        System.out.println(~0); //output -1.
        //MSB always tell us then number is pos or neg.


        //Binary Left Sift:
        //Suppose a binary number give ex - 5 , i have to left sift 2 
        //the way it's write 5<<2

        // 5--> 000101
        //ans -> 010100 
        System.out.println((5<<2));

        //Rule: a<<b = a * 2^b


        //Binary Right Sift.
        //same as left sift.
        //5>>2
        
        //Rules: a>>b = a/2^b
        
    }
}
