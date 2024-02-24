import java.util.*;

public class MinHeapImplementation { 
    public static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        //add Methord..
        public void add(int data){  //Add time complexity is 0(log n)..
            //add at last index.
            list.add(data);
            int x = list.size()-1;  //x is my child index.
            int parent = (x-1)/2; // this is my parent index.

            while(list.get(x) < list.get(parent)){ //this loop take 0(log n) time because i to parent only level by level
                //swap.
                int tem = list.get(x);
                list.set(x, list.get(parent));
                list.set(parent, tem);

                //update the iterator..
                x = parent;
                parent = (x-1)/2;
            }
        }

        //Peek Methord..
        public int peek(){
            return list.get(0);
        }

        //Heapify is private Methord.
        private void Heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIndx = i; //consider that my last index is my min index.

            if(left < list.size() && list.get(minIndx)> list.get(left)){
                minIndx = left;
            }
            if(right < list.size() && list.get(minIndx)> list.get(right)){
                minIndx = right;
            }
            if(minIndx!=i){
                //swap.
                int tem = list.get(i);
                list.set(i, list.get(minIndx));
                list.set(minIndx, tem);

                //recursively call for other node.
                Heapify(minIndx);
            }
        }

        //Delete Methord..
        public int remove(){
            int data = list.get(0);
            //Step 1 : Swap 1st and last..
            int tem = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, tem);

            //Step 2: Delete last index.
            list.remove(list.size()-1);

            //Step 3 : Heapify.
            Heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size() ==0;
        }
    }
    public static void main(String[] args) {
        Heap h1 = new Heap();
        h1.add(3);
        h1.add(4);
        h1.add(1);
        h1.add(5);

        while(!h1.isEmpty()){
            System.out.println(h1.peek());
            h1.remove();
        }
    }
}

/*   Priority Queue exactly do what Heap will do .
     This is Min-Heap  Implementation.
*/