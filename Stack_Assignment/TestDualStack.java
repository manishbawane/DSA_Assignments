package Stack_Assighnment;

import java.util.Scanner;

public class TestDualStack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the array: ");
		int capacity = scanner.nextInt();
		DualStack dualStack = new DualStack(capacity);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Push to Stack 1");
			System.out.println("2. Pop from Stack 1");
			System.out.println("3. Peek at Stack 1");
			System.out.println("4. Check if Stack 1 is empty");
			System.out.println("5. Push to Stack 2");
			System.out.println("6. Pop from Stack 2");
			System.out.println("7. Peek at Stack 2");
			System.out.println("8. Check if Stack 2 is empty");
			System.out.println("9. Exit");

			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter item to push to Stack 1: ");
				int item1 = scanner.nextInt();
				dualStack.push1(item1);
				break;
			case 2:
				int popped1 = dualStack.pop1();
				if (popped1 != -1) {
					System.out.println("Popped from Stack 1: " + popped1);
				}
				break;
			case 3:
				int peeked1 = dualStack.peek1();
				if (peeked1 != -1) {
					System.out.println("Top of Stack 1: " + peeked1);
				}
				break;
			case 4:
				System.out.println("Stack 1 is " + (dualStack.isEmpty1() ? "empty." : "not empty."));
				break;
			case 5:
				System.out.print("Enter item to push to Stack 2: ");
				int item2 = scanner.nextInt();
				dualStack.push2(item2);
				break;
			case 6:
				int popped2 = dualStack.pop2();
				if (popped2 != -1) {
					System.out.println("Popped from Stack 2: " + popped2);
				}
				break;
			case 7:
				int peeked2 = dualStack.peek2();
				if (peeked2 != -1) {
					System.out.println("Top of Stack 2: " + peeked2);
				}
				break;
			case 8:
				System.out.println("Stack 2 is " + (dualStack.isEmpty2() ? "empty." : "not empty."));
				break;
			case 9:
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
