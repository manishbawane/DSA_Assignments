package QueueAssignment;

import java.util.Scanner;

class TwoQueues {
    private int[] arr;
    private int size;
    private int front1, rear1, front2, rear2;

    public TwoQueues(int size) {
        this.size = size;
        arr = new int[size];
        front1 = -1;  
        rear1 = -1;   
        front2 = size;
        rear2 = size;  
    }

    public void enqueue1(int value) {
        if (rear1 + 1 == front2) {
            System.out.println("Queue 1 is full");
            return;
        }
        if (front1 == -1) {
            front1 = 0; 
        }
        rear1++;
        arr[rear1] = value;
    }

    public void enqueue2(int value) {
        if (rear2 - 1 == rear1) {
            System.out.println("Queue 2 is full");
            return;
        }
        if (front2 == size) {
            front2 = size - 1; 
        }
        rear2--;
        arr[rear2] = value;
    }

    public void dequeue1() {
        if (front1 == -1 || front1 > rear1) {
            System.out.println("Queue 1 is empty");
            return;
        }
        System.out.println("Dequeued from Queue 1: " + arr[front1]);
        front1++;
    }

    public void dequeue2() {
        if (front2 == size || front2 <= rear2) {
            System.out.println("Queue 2 is empty");
            return;
        }
        System.out.println("Dequeued from Queue 2: " + arr[front2]);
        front2++;
    }

    public void printQueue1() {
        if (front1 == -1 || front1 > rear1) {
            System.out.println("Queue 1 is empty");
            return;
        }
        System.out.print("Queue 1: ");
        for (int i = front1; i <= rear1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printQueue2() {
        if (front2 == size || front2 <= rear2) {
            System.out.println("Queue 2 is empty");
            return;
        }
        System.out.print("Queue 2: ");
        for (int i = rear2; i < front2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoQueues queues = new TwoQueues(10); // Adjust size as needed

        while (true) {
            System.out.println("Options: 1) Enqueue from 1 2) Enqueue from 2 3) Dequeue from 1 4) Dequeue from 2 5) Print Queue 1 6) Print Queue 2 7) Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter value to enqueue in Queue 1: ");
                    queues.enqueue1(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to enqueue in Queue 2: ");
                    queues.enqueue2(scanner.nextInt());
                    break;
                case 3:
                    queues.dequeue1();
                    break;
                case 4:
                    queues.dequeue2();
                    break;
                case 5:
                    queues.printQueue1();
                    break;
                case 6:
                    queues.printQueue2();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
