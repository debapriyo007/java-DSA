public class linklist3 {
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

    //find middle node..
    //SLOW FAST APPROACH.
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next; //+1
            fast = fast.next.next;

        }
        return slow;  //slow is my middle node..
    }
    
    public boolean checkPalindrom(){
        
        //base case..
        if(head ==  null && head.next == null){
            return true;
        }

        //step 1: find middle..
        Node middlenode = findMiddle(head);

        //step 2: Reverse the second half of the linklist..

        Node prev = null;
        Node curr = middlenode;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;   //right half head..
        Node left = head;    //left half linklist head..

        //step 3: check left half and right half..

        while(right!= null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

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
        linklist3 ll = new linklist3();

       ll.addLast(1);
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(1);
      //ll.addLast(5);
       ll.printLinklist();
       System.out.println(ll.checkPalindrom());
       

    }

}

