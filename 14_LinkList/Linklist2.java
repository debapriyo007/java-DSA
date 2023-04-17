public class Linklist2 {
    // create node...
    public static class Node {
        int data;
        Node next;

        // create constructor...
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    // In linkList one HEAD and one TAIL is exist
    // so we can define then inside the class as a poperty..

    public static Node head;
    public static Node tail;

   
    

    // Create addLast fun..
    public void addLast(int data) {

        // step 1: create a new node...
        Node newNode = new Node(data);
        

        // base case..
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: tail is poiinting the new node..
        tail.next = newNode;

        // step 3: tail will be updated..
        tail = newNode;

    }

    //Find and remove Nth node from end..
    public void removeNthnode(int n){
        //calculate the size ..
        int size = 0;
        Node tem = head;
        while(tem != null){
            tem = tem.next;
            size++;
        }
        if(n == size){  // if my Nth is equal to my size the head will update..
         
            head = head.next;
            return;
        }

        int i = 1;
        Node prev = head;
        while(i< size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    


    // ----------------------------------Print Linklist----------------------

    public void printLinklist() {
        if (head == null) {
            System.out.println("LinkList is Empty!");
            return;
        }
        Node tem = head;
        while (tem != null) {
            System.out.print(tem.data + "-->");
            tem = tem.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        // create an object of an linklist..
        Linklist2 ll = new Linklist2();

       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.printLinklist();
       System.out.println("After remove Nth node from last the linklist is: ");
       ll.removeNthnode(2);
       ll.printLinklist();

    }

}
