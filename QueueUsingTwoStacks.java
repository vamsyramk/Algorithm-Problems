package main.java.com.monotonic.testing.m2;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> stack1;
	Stack<Integer> stack2;

	QueueUsingTwoStacks() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	
	public void add(int element) {
		if(stack1.size() == 0){
			stack1.add(element);
		}else{
			while(!stack1.isEmpty()){
				stack2.add(stack1.pop());
			}
			stack1.add(element);
			while(!stack2.isEmpty()){
				stack1.add(stack2.pop());
			}
		}
		System.out.println(stack1);
	}

	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.add(20);
		queue.add(40);
		queue.add(70);
		queue.add(50);
		queue.add(90);
		queue.add(110);
		queue.add(30);
		System.out.println("Removed element : " + queue.remove());
		queue.add(170);
		System.out.println("Removed element : " + queue.remove());
	}

	public int remove() {
		if(!stack1.isEmpty())
		return stack1.pop();
		else return 0;
	}

	
}
