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

        DoublyLinkedList dll = new DoublyLinkedList();

//        dll.add(newNode);
        dll.forwardTraversing();
        dll.reverseTraversing();
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
            System.out.println("reverse traversal : " + temp.data + " ");
            temp=temp.prev;
        }
    }



}
