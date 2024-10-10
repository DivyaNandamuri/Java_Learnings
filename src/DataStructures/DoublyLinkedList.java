package DataStructures;

//Creating node using double linked list
class DoubleLLNode {
    //declaring instance variables
    int data;
    DoubleLLNode prev;
    DoubleLLNode next;

    //initialisng instance variables
    public DoubleLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DoublyLinkedList {
    DoubleLLNode head;
    DoubleLLNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String args[]) {
        //initial node
        DoubleLLNode newNode = new DoubleLLNode(3);
//        System.out.println("New node:" + newNode.data);
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(5);
        dll.add(6);
        dll.add(10);
        dll.forwardTraversing();
        System.out.println();
        dll.reverseTraversing();
        System.out.println();
        dll.insertAtPosition(2,8);
        dll.insertAtPosition(4,9);
        dll.forwardTraversing();
    }

    // Traversing from head to the end of the list
    public void forwardTraversing() {
        DoubleLLNode temp = head;
        while(temp != null) {
            System.out.println("Forward traversing : "+ temp.data + " ");
            temp=temp.next;
        }
    }

    //Traversing from end to head of the list
    public void reverseTraversing() {
        DoubleLLNode temp = tail;
        while(temp !=null) {
            System.out.println("Reverse traversal : " + temp.data + " ");
            temp=temp.prev;
        }
    }

    //Inserting at the begining
    public void add(int second_node) {
        DoubleLLNode newNode = new DoubleLLNode(second_node);
        DoubleLLNode temp = head;
        //if no nodes
        if(temp==null){
            head = newNode;
            tail = newNode;
            return;
        }
        //to add at beginning of the list
        else {
            newNode.next=temp;
            temp.prev = newNode;
            head = newNode;
            return;
        }
    }

    //Inserting at specific position
    public void insertAtPosition(int position, int data) {
        DoubleLLNode newNode = new DoubleLLNode(data);
        DoubleLLNode curr = head;
        // to find length
        int length = 0;
        while(curr!=null){
            curr = curr.next;
            length++;
        }

        //if dll is empty - first node
        if(length==0) {
            head = newNode;
            tail = newNode;
            return;
        }

        if(position < 0){
            System.out.println("Enter a valid position");
        }
        else if(position>length){
            System.out.println("Position is greater than length.. So adding node at end of list ");
            DoubleLLNode last = tail;
            newNode.prev = last;
            last.next = newNode;
            return;
        }

        //inserting at given position
        DoubleLLNode current = head;
        while(position!=1){
            current=current.next;
            position--;
        }
        newNode.prev= current.prev;
        current.prev.next = newNode;
        newNode.next = current;
        current.prev= newNode;
    }

}
