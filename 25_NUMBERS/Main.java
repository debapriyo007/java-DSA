
//Problems on Numbers.


public class Main{
	public static void main(String[] args) {
 		int n = 9474;
 		int n2 = 102;
	    
        // System.out.println(isPalindrom(n));
        // printPalindrom(10, 60);
        // System.out.println(isPrime(n));
        //  printPrimeNumbers(1, 50);
        // System.out.println(chekAmstrong(n));
        // System.out.println(isPerfectNumebr(n2));
        System.out.println(checkOddEven(n2));
	}
	
	//this is the code for check the palindrom numbers.
	static boolean isPalindrom(int n){
	    
	    int rev = 0;
	    int com = n;
	    while(n>0){
	        int lastDig = n%10;
	        rev = lastDig + (rev*10);
	        n = n/10;
	    }
	    if(com == rev){
	        return true;
	    }
	    return false;
	}
	
	//print palindrom numbers between the particular range..
	
	static void printPalindrom(int siNum, int edNum){
	    for(int i = siNum ;i<= edNum ;i++){
	        if(isPalindrom(i)){
	           System.out.println(i + " ");
	        }
	    }
	}
    
    
    //check prime or not.
    static boolean isPrime(int n){
        int cnt = 0;
        if(n == 0)return false;
        for(int i = 1;i<= n ;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 2){
            return true;
        }
        return false;
    }
    
    //print prime numbers between this range..
    static void printPrimeNumbers(int stNum, int endNum){
        for(int i = stNum ;i<= endNum ;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    
    // check the number is amstrong or not ????
    
    static boolean chekAmstrong(int n){
        
        int orgNum = n;
        int amgNum = 0;
        int k = String.valueOf(n).length();
        while(n>0){
            
            //extract last digits.
            int lastDig = n %10;
            amgNum += Math.pow(lastDig, k);
            n = n /10;
        }
        if(orgNum == amgNum){
            return true;
        }else{
            return false;
        }
    }
    
    
    //chcek if the number is prfect or not.
    // what is Parfect Number : 6 -> 1 + 2 + 3 = 6 sum of it's all factorial.
    static boolean isPerfectNumebr(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
            
        }
        if(sum == n)return true;
        return false;
    }
    
    static boolean checkOddEven(int n){
        if((n&1) == 0){
            return true; //this is return Even number.
        }else{
            return false; //this is Odd Number..
        }
    }
}