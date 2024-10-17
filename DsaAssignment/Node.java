package DsaAssignment;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data > data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        if (current.data != data) { 
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public SinglyLinkedList union(SinglyLinkedList otherList) {
        SinglyLinkedList unionList = new SinglyLinkedList();
        Node current = head;

        while (current != null) {
            unionList.insertSorted(current.data);
            current = current.next;
        }

        current = otherList.head;
        while (current != null) {
            unionList.insertSorted(current.data);
            current = current.next;
        }

        return unionList;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

