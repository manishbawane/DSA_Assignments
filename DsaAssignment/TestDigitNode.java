package DsaAssignment;

import java.util.Scanner;

public class TestDigitNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        DigitLinkedList digitList = new DigitLinkedList();
        digitList.createFromNumber(number);
        System.out.println("Digits in the linked list:");
        digitList.printList();
    }
}
