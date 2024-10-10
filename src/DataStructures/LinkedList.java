package DataStructures;

//defining and initializing node of Linkedlist
class Node {
    int data;
    Node next;

    //constructor to initialize data and next
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
}

public class LinkedList {
    Node head;
    public LinkedList(Node data) {
        this.head = data;
    }

    public Node add(int value) {
        //create a node with value 
        Node newnode = new Node(value);
        //if the list is null
        if(head == null){
          head = newnode;
          return head;
        }
        Node current =  head;
        while(current.next != null){
            current= current.next;
        }
        current.next = newnode;
        return head;
    }

    public void traverse(){
        Node curr = head;
        if(curr == null){
            System.out.println("No nodes to traverse");
            return;
        }
        //getting all nodes
        while(curr.next != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(curr.data + " ");
    }
    public void remove(int value) {
        Node curr = head;
        // if the head is the value that is to be removed
        if(curr.data == value) {
            if(curr.next != null) {
                head = curr.next;
            }
            else {
                head = null;
            }
            return;
        }
        //to find the value in LL
        while(curr.next!=null) {
            if(curr.next.data == value) {
                Node temp = curr.next;
                curr.next=curr.next.next;
                temp.next = null;
            } else {
                curr = curr.next;
            }
        }
        return;
    }

    public void insert(int position, int value) {
        Node newnode = new Node(value);

        if(position <0){
            System.out.print("\nEnter valid position..");
            return;
        }

        int length = 0;
        // get the count of nodes in the linked list
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        if(position > length){
            System.out.println("\nposition is exceeding the count");
            return;
        }

        // looks like the position is valid
        temp = head;
        while(position!= 1){
            temp = temp.next;
            position--;
        }
        // insert at the position

        newnode.next = temp.next;
        temp.next = newnode;
        return;

    }



    public static void main(String args[]) {
        Node first_node = new Node(5);
        System.out.println("First Node: " + first_node.data);
        LinkedList ll= new LinkedList(first_node);
        //adding nodes
        ll.add(7);
        ll.add(4);
        ll.add(2);
        System.out.println("After adding new nodes: ");
        ll.traverse();
       //insert
        ll.insert(2,8);
        System.out.println("\nAfter successful insertion:");
        ll.traverse();
        //delete
        ll.remove(2);
        System.out.println("\nAfter removal of a node:");
        ll.traverse();
    }

}

