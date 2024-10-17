package DsaAssignment;

import java.util.Scanner;

class DigitNode {
    int digit;
    DigitNode next;

    DigitNode(int digit) {
        this.digit = digit;
        this.next = null;
    }
}

class DigitLinkedList {
    DigitNode head;

    public void createFromNumber(int number) {
        String numStr = String.valueOf(number);
        for (char ch : numStr.toCharArray()) {
            DigitNode newNode = new DigitNode(Character.getNumericValue(ch));
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        DigitNode current = head;
        while (current != null) {
            System.out.print(current.digit + " ");
            current = current.next;
        }
        System.out.println();
    }
}


