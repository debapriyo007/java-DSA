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

    // define size..
    public static int size;

    // ----------------------Creating methords for Add
    // linklist--------------------------------------------..

    // create "addFirst" fun..
    public void addFirst(int data) {
        // step 1: create a new node...
        Node newNode = new Node(data);
        size++;

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
        size++;

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

    // add middle in the linklist..

    public void addMiddle(int indx, int data) {
        // some one add at index 0 ..
        if (indx == 0) {
            addFirst(data);
            return;
        }
        // create new node...
        Node newNode = new Node(data);
        size++;
        Node tem = head;
        int i = 0; // intial the index from 0
        while (i < indx - 1) {
            tem = tem.next;
            i++;
        }

        // new node will pointing tem next..
        newNode.next = tem.next;
        // tem next will pointing new node
        tem.next = newNode;

    }

    // ---------------------Remove
    // Functions------------------------------------------------------------------

    // Remove first..
    public int removeFist() {
        // special cases...
        if (size == 0) {
            System.out.println("LinkList is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last..
    public int removeLast() {
        // corner cases..
        if (size == 0) {
            System.out.println("The Linklist is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // -------------------Search function-------------------------

    public int iterativeSearch(int key) { // Liner Time complexity..0(n)
        // initial the index...
        int indx = 0;
        // store the tem in head..
        Node tem = head;
        // check the key is present or not in the linklist..

        while (tem != null) {
            if (tem.data == key) {
                return indx;
            }
            // tem will be pointing next node..
            tem = tem.next;
            // index will updated...
            indx++;
        }
        return -1;
    }

    // helper function....

    public int helper(Node head, int key) {

        // base case..
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // .................Reverse Linklist.....................................

    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next; // Initilize the next in the loop..
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        LinkList ll = new LinkList();

        // <------- We are not perform the Methords in Main function. Create the methord
        // inside the class. like ---> add(), remove(), printll(), search().
        // ll.head = new Node(1);
        // ll.head.next = new Node(1);
        // ll.printLinklist();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addMiddle(2, 9);
        // ll.printLinklist();
        // ll.removeFist();
        // ll.printLinklist();
        // ll.removeLast();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLinklist();
        ll.Reverse();
        ll.printLinklist();

        int index = ll.recursiveSearch(4);
        if (index == -1) {
            System.out.println("The key is not found!!");
        } else {
            System.out.println("The key is found at index " + index);
        }

        System.out.println("LinkList size = " + ll.size);

    }

}
