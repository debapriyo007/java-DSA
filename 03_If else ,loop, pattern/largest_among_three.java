public class largest_among_three {
    public static void main(String args[]){
        int a,b,c;
        a=10;
        b=20;
        c=5000;
        int large;

        if((a>=b)&& (a>c))
        {
          large=a;
        }
        else if(b>=c)
        {
            large=b;
        }
        else
        {
            large=c;
        }
        System.out.println("The large num is "+ large);

    }
    
}
