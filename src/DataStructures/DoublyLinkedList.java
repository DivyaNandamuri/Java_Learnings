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
        System.out.println("New node:" + newNode);
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(5);
        dll.add(6);
        DoubleLLNode tail = dll.forwardTraversing();
        dll.reverseTraversing(tail);
    }

    // Traversing from head to the end of the list
    public DoubleLLNode forwardTraversing() {
        DoubleLLNode temp = head;
        while(temp != null) {
            System.out.println("Forward traversing : "+ temp.data + " ");
            tail=temp;
            temp=temp.next;
        }
        return tail;
    }

    //Traversing from end to head of the list
    public void reverseTraversing(DoubleLLNode tail) {
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
            return;
        }
        //to add at beginning of the list
        if(temp !=null) {
            newNode.next=temp;
            newNode.prev= null;
            temp.prev = newNode;
            head = newNode;
            return;
        }
    }

}
