class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    public static Node head;
    public static Node tail;
    public static int size;
    
    
    //add First.
    void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    //add Last.
    void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail  = newNode;
    }
    
    //add any index.
    void addIndex(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node tem = head;
        int i = 0;
        while(i < index-1){ 
            tem = tem.next;
            i++;
        }
        newNode.next = tem.next;
        tem.next = newNode;
    }
    
    
    
    //remove First.
    void removeFirst(){
        //this is fine! but i do something that remove aswell return the value.
        // head = head.next; 
        // size--;
        if(head == null){
            System.out.print("LinkedList is empty!");
        }
        int x = head.data;
        head = head.next;
        size--;
        System.out.println( x + " is remove from first!");
    }
    
    //remove Last.
    void removeLast(){
        Node tem = head;
        if(tem == null){
            System.out.print("LinkedList is Empty!");
        }
        while(tem.next.next!= null){
            tem = tem.next;
        }
        int x = tem.next.data;
        tem.next = null;
        size--;
        System.out.println( x  + " is remove from last!");
    }
    
    
    //print LinkedList
    void printLL(){
        Node tem = head;
        while(tem!= null){
            System.out.print(tem.data + "->");
            tem = tem.next;
        }
        System.out.println("null");
    }
    
    void size(){
        System.out.println(size);
    }
    
    boolean isEmpty(){
        return (size > 0) ? false : true;
    }
    
    void search(int data){
        int x = helper(data);
        if(x == -2){
            System.out.println("LinkedList is empty you can't search!");
        }
        if(x == -1){
            System.out.println("Node is not Found!!");
        }else{
            System.out.println("Node found at index " + x);
        }
    }
    int helper(int data){
        Node tem = head;
        if(tem == null){return -2;}
        int index = 0;
        while(tem!= null){
            if(tem.data == data){
               return index;
            }
            tem = tem.next;
            index++;
        }
        return -1;
    }
    
}

public class Main{
	public static void main(String[] args) {
		LinkedList ll  = new LinkedList();
 		ll.addFirst(12);
		ll.addFirst(13);
		ll.addFirst(14);
		ll.addLast(21);
		ll.addLast(22);
		ll.addLast(23);
		ll.addIndex(1, 999);
 		ll.removeFirst();
		ll.removeFirst();
        ll.removeLast();
        ll.search(22);
	    
		ll.printLL();
		System.out.print("LinkedList Size : ");
		ll.size();
		System.out.println(ll.isEmpty());
	}
}