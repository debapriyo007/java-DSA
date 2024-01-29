# Operation In Bit Manipulation 🔥

 ## Get i'th Bit
```JavaScript

Suppose there is a Random number is given  like - 10001001110
In this number findout the i'th bit ?
if i = 3

So indexing will be start from `LSB`
here, i'th bit will be = 1

//Get i'th Bit.
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

```

##  Set i'th Bit

```JavaScript
    // Set i'th Bit
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
```

 ## Clear i'th Bit

 ```JavaScript
    //Clear i'th Bit
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
```