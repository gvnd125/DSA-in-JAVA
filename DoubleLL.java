public class DoubleLL {
    public class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;

    public void insertAtBeginning(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            temp.prev = newNode;
            newNode.next = temp;
            head = newNode;
        }
    }

    public void insertAtEnding(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    public void displayLL() {
        if(head == null) {
            System.out.println("\tThe List is Currently Empty");
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(temp.data+"\n");
        }
    }

    public static void main(String...args) {
        DoubleLL dll = new DoubleLL();
        dll.displayLL();
        dll.insertAtBeginning("first");
        dll.displayLL();
        dll.insertAtBeginning("second");
        dll.displayLL();
        dll.insertAtEnding("last");
        dll.displayLL();
    }
}