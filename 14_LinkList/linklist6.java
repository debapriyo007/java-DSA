public class linklist6 {
     
    public static class Node{
        int data;
        Node next;

        //creating constructor..
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //add last and create Linklist..
    public void addLast (int data){

        //create a newnode..

        Node newnode = new Node(data);
        //base case..
        if(head == null){
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    //printing linlist..
    public void printlinklist(){

        //base case ..
        if(head == null){
            System.out.println("The linklist is empty!!");
            return;
        }
        Node tem = head;
        while(tem != null){
            System.out.print(tem.data + "-->");
            tem= tem.next;
        }
        System.out.println("null");
    }



    //zig Zag fun..
    public void zigZag(){
        //step1: find the middle of the node..
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        //Step 2: Reverse the 2nd half..
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;  //linklist left sub linklist become my head..
        Node right = prev;
        Node nextL , nextR;  //To perform the merge zig-zag..

        //step 3: merge the zigzag..
        while(left!= null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next =nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        //creating object..
        linklist6  ll = new linklist6();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printlinklist();
        ll.zigZag();
        ll.printlinklist();

        
    }
}
