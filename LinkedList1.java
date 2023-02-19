class LinkedList1 {
    class Node {
        String data;
        Node next;
    
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;

    public void insertAtBeginning(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
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
            temp.next = newNode;
        }
    }

    public void createLL(String...arg) {
        if(head == null) {
            
            Node newNode = new Node(arg[0]);
            head = newNode;
            Node temp = head;
            /*while(temp.next !=null) {
                temp = temp.next;
            }*/
            for(int i=1 ; i<arg.length ; i++) {
                Node newNode1 = new Node(arg[i]);
                temp.next = newNode1;
                temp = temp.next;
            }

        }
        else {
            Node temp = head;
            while(temp.next !=null) {
                temp = temp.next;
            }
            for(int i=0 ; i<arg.length ; i++) {
                Node newNode = new Node(arg[i]);
                temp.next = newNode;
                temp = temp.next;
            }
        }
    }

    public void displayLL() {
        if(head == null) {
            System.out.println("\tThe List is Currently Empty");
        }
        else {
            Node temp = head;
            //System.out.print("HEAD -> ");
            while(temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(temp.data+"\n");
            //System.out.print("NULL\n");
        }
    }

    public void reverseLL() {           //work in progress
        int n = 0;
        if(head == null) {
            n = 0;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                ++n;
                temp = temp.next;
            }
            n++;
        }

        if(n == 0) {
            System.out.println("Empty List cannot be reversed");
        }
        else {
            final String arr[] = new String [n];
            Node temp = head;
            for(int i=0 ; i<n ; i++){
                arr[i] = temp.data;
                temp = temp.next;
            }
            temp = head;
            for(int i=(n-1) ; i>=0 ; --i){
                temp.data = arr[i];
                temp = temp.next;
            }
        }
    }

    public static void main(String...args) {
        LinkedList1 ll = new LinkedList1();
        /*ll.displayLL();
        ll.insertAtBeginning("wELCOME");
        ll.displayLL();*/
        ll.createLL("my","home","their","is","no","turning");
        ll.displayLL();
        ll.insertAtEnding("to");
        ll.displayLL();
        ll.insertAtBeginning("Hello ji");
        ll.displayLL();
        ll.insertAtBeginning("govind");
        ll.displayLL();
        ll.reverseLL();
        ll.displayLL();
    }
}