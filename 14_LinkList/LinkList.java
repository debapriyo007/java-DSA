public class LinkList {
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

    // Creating methords..

    // create "addFirst" fun..
    public void addFirst(int data) {
        // step 1: create a new node...
        Node newNode = new Node(data);

        // if the linklist is empty..then head and tail both are same..
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // step 2: newnode next pointing head..
        newNode.next = head;
        // step 3: head = newnode..
        head = newNode;
    }

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

    //Print Linklist function...

    public void printLinklist(){
        if(head == null){
            System.out.println("LinkList is Empty!");
            return;
        }
        Node tem = head;
        while(tem!= null){
            System.out.print(tem.data + "-->");
            tem = tem.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        // create an object of an linklist..
        LinkList ll = new LinkList();

        // <------- We are not perform the Methords in Main function. Create the methord
        // inside the class. like ---> add(), remove(), printll(), search().
        // ll.head = new Node(1);
        // ll.head.next = new Node(1);
        ll.printLinklist();
        ll.addFirst(2);
        ll.printLinklist();
        ll.addFirst(1);
        ll.printLinklist();
        ll.addLast(3);
        ll.printLinklist();
        ll.addLast(4);
        ll.printLinklist();
        

    }

}
