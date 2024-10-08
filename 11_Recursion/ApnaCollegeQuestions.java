package Recursion.ShradhaDi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ApnaCollegeQuestions {
    static String[]keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    static int fstOc = -1;
    static int lastOc = -1;

    // ++++++++++++++++++++++ VIDEO 1 +++++++++++++++++++++++++++++++++++++++++++++

    //q1:Tower of Hanoi
    int towerOfHanoi(int n, String src, String desc, String helper){
       //There is another que how many move to perform ?
        int cntmove = 0;


        //base case: when i have only 1 disk i have to move directly from src to des.
        if(n == 1){
            System.out.println("Move disk " + n +" from " + src + " -> " + desc);
            return 1;
        }
        //step1: move n-1 disk from src to helper.
        cntmove = towerOfHanoi(n-1, src, helper, desc);
        //step2: move nth disk from src to des.
        System.out.println("Move disk " + n +" from " + src + " -> " + desc);
        cntmove++;
        //step3: move n-1 disk from helper to des
        cntmove+=  towerOfHanoi(n-1, helper, desc, src);
        return  cntmove;
    }

    //q2:Reverse a string.
    void reverseString(String s, int index){
        if(index == -1){
            return;
        }
        System.out.print(s.charAt(index));
        reverseString(s, index-1);
    }

    //q3: Find first & last occurrence of element.
    void firstandLastOcc(String s, int index, char target){

        if(index == s.length()){
            System.out.println(fstOc);
            System.out.println(lastOc);
            return;
        }
        if(s.charAt(index) == target){
            if(fstOc == -1){
                fstOc = index;
            }else{
                lastOc = index;
            }
        }
        firstandLastOcc(s, index+1, target);
    }

    //q5: Check is Sorted.
    public boolean isSorted(int index , int[]arr){
        //give a base case.
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && isSorted(index+1, arr);
    }

    //q6:Move 'x' to the end.
    public void moveEnd(String str, int index, int cnt, String newString){

        if(index == str.length()){
            for(int i = 0;i<cnt;i++){
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(index) == 'x'){
            cnt++;
            moveEnd(str, index+1, cnt, newString);
        }else{
            newString+= str.charAt(index);
            moveEnd(str, index+1, cnt, newString);
        }
    }

    //q7: Remove duplicate from the string.
    public void removeDuplicate(String str, int index, String newString, boolean[]map){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            //if this index value is TRUE. Means prev this char is occ.
            removeDuplicate(str, index+1, newString, map);
        }else{
            //if false
            newString+= currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, index+1, newString, map);
        }

    }

    //q8: Print all the subsequence of string.
    public  void subsequence(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currCh = str.charAt(index);
        //choose to be.
        subsequence(str, index+1, newString+currCh);
        //choose not to be.
        subsequence(str, index+1,newString);

    }

    //q9: Print unique SubSequence.
    public void printUniqueSubsequence(String str, int index, String newString, HashSet<String>set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        printUniqueSubsequence(str, index+1, newString+currChar, set);
        printUniqueSubsequence(str, index+1, newString, set);
    }

    //q10 :  Print Keypad Combinations
    public void printKeyPadCombinations(String str, int index, String combination){
        if(index == str.length()){
            System.out.print(combination + ",");
            return;
        }

        char currChar = str.charAt(index);
        String keyPadString = keypad[currChar -'0'];
        for(int i = 0;i<keyPadString.length();i++){
            printKeyPadCombinations(str, index+1, combination+keyPadString.charAt(i));
        }

    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    // ++++++++++++++++++++++ VIDEO 2 +++++++++++++++++++++++++++++++++++++++++++++++

    //q11: Print all permutations for a String.
    public void printAllPermutationString(String str, String per){
        if(str.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char currCh = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printAllPermutationString(newString, per+currCh);
        }
    }

    //q12: Count the total path to  reach (0,0) to (n, m).
    // to move possible down and right.
    public int countWays(int m, int n , int i, int j){
        //this is the base case. where i stop.
        if(i == m-1 && j == n-1){return 1;}

        //edge case.
        if(i >= m || j >= n){return 0;} //outof bound the pointer so return 0
        int downWays = countWays(m, n, i+1, j);
        int rightWays = countWays(m, n, i, j+1);
        return downWays + rightWays;
    }

    //q:12 Place Tiles of size 1xm in floor of size n X m
    public int countPlaceTiles(int n , int m){

        if(n == m){
            //means this is a square size matrix only 2 ways to place the tiles.
            return 2;
        }
        if(m>n){
            //only 1 way place is horizontal.
            return 1;
        }

        //placed vertically.
        int vertically = countPlaceTiles(n-m, m);
        int horizontally = countPlaceTiles(n-1, m);
        return vertically + horizontally;
    }

    //q:13 Calling guest in no of ways.
    //You can call the guest one by one or call the guest in a from of pair.
    public  int callingTheGuestWays(int n){
        if(n <= 1){
            return 1;
        }
        int ways1 = callingTheGuestWays(n-1);
        int ways2 = (n-1) * callingTheGuestWays(n-2);
        return ways1 +  ways2;
    }

    //q:14 Print all the subset of a set of first "n" natural number.
    // n = 3 (1, 2, 3) --> (1, 2, 3) , (1), (2) , (3) , (1,2), (1,3), (2,3), ()
    public void findSubSet(int n , ArrayList<Integer>list){
        if(n == 0){
            System.out.println(list);
            return;
        }
        //add each element.(choice 1)
        list.add(n);
        findSubSet(n-1, list);

        //not to add an element (choice 2)
        list.remove(list.size()-1);
        findSubSet(n-1, list);
    }


    public static void main(String[] args) {
        //creating object.
        ApnaCollegeQuestions q = new ApnaCollegeQuestions();

        int x = q.towerOfHanoi(5, "|src|", "|desc|", "|helper|");
        System.out.println("* Sift all Disks moves are: " + x);

        String s = "Debu21";
        q.reverseString(s,s.length()-1);


        String str = "abaacdaefaah";
        q.firstandLastOcc(str, 0, 'a');

        System.out.println(q.isSorted(0, new int[]{1, 2, 4, 6, 77}));

        String s2 = "axbxcxxd";
        q.moveEnd(s2, 0, 0, "");

        String s3 = "abbccd";
        q.removeDuplicate(s3, 0,"", new boolean[26]);

        q.subsequence("abc", 0, "");

        System.out.println("Print Unique Sub-sequence are : ");
        q.printUniqueSubsequence("abc", 0,"", new HashSet<>());

        q.printKeyPadCombinations("23", 0, "");

        System.out.println("Print all Permutation of string : ");
        q.printAllPermutationString("abc", "");

        int ways = q.countWays(3, 7, 0, 0);
        System.out.println("The number of ways to reach : " + ways);

        int waysPlace = q.countPlaceTiles(4, 2);
        System.out.println("The number of Ways to place the tiles : " + waysPlace);

        int callGuest = q.callingTheGuestWays(4);
        System.out.println("The ways of calling the number of guest : " + callGuest);

        //+++++++++++++++++ Last Questions ++++++++++++++++++++++++++++++++++
        ArrayList<Integer> list = new ArrayList<>();
        q.findSubSet(3, list);
    }

}
