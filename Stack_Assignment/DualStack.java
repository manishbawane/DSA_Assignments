package Stack_Assighnment;

class DualStack {
	private int capacity;
	private int[] array;
	private int top1;
	private int top2;

	public DualStack(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.top1 = -1;
		this.top2 = capacity;
	}

	public void push1(int item) {
		if (top1 + 1 < top2) {
			array[++top1] = item;
		} else {
			System.out.println("Stack 1 Overflow");
		}
	}

	public int pop1() {
		if (top1 >= 0) {
			return array[top1--];
		} else {
			System.out.println("Stack 1 Underflow");
			return -1;
		}
	}

	public int peek1() {
		if (top1 >= 0) {
			return array[top1];
		} else {
			System.out.println("Stack 1 is empty");
			return -1;
		}
	}

	public boolean isEmpty1() {
		return top1 == -1;
	}

	public void push2(int item) {
		if (top2 - 1 > top1) {
			array[--top2] = item;
		} else {
			System.out.println("Stack 2 Overflow");
		}
	}

	public int pop2() {
		if (top2 < capacity) {
			return array[top2++];
		} else {
			System.out.println("Stack 2 Underflow");
			return -1;
		}
	}

	public int peek2() {
		if (top2 < capacity) {
			return array[top2];
		} else {
			System.out.println("Stack 2 is empty");
			return -1;
		}
	}

	public boolean isEmpty2() {
		return top2 == capacity;
	}
}
