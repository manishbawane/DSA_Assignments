package DsaAssignment;

import java.util.Scanner;

public class TestNodePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        
        System.out.print("Enter number of elements in first list: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter sorted elements for first list:");
        for (int i = 0; i < n1; i++) {
            list1.insertSorted(scanner.nextInt());
        }

    
        System.out.print("Enter number of elements in second list: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter sorted elements for second list:");
        for (int i = 0; i < n2; i++) {
            list2.insertSorted(scanner.nextInt());
        }

       
        SinglyLinkedList unionList = list1.union(list2);
        System.out.println("Union of the two linked lists:");
        unionList.printList();
    }
}

