package main.java.com.monotonic.testing.m2;

public class StackUsingArray {
	int size = 0;
	int top = 0;
	int[] arr;

	public StackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public void pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			

		} else {
			System.out.println("Stack is empty !");
		
		}
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(10);

		System.out.println("=================");
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		System.out.println("=================");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("=================");
	}
}
