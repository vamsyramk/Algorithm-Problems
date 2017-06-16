package main.java.com.monotonic.testing.m2;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	StackUsingTwoQueues() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}
	
	public void push(int element) {
		if(queue1.size() == 0){
			queue1.add(element);
		}else{
			while(!queue1.isEmpty()){
				queue2.add(queue1.remove());
			}
			queue1.add(element);
			while(!queue2.isEmpty()){
				queue1.add(queue2.remove());
			}
		}
		System.out.println(queue1);
	}

	public static void main(String[] args) {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(20);
		stack.push(40);
		stack.push(70);
		stack.push(50);
		stack.push(90);
		stack.push(110);
		stack.push(30);
		System.out.println("Removed element : " + stack.pop());
		stack.push(170);
		System.out.println("Removed element : " + stack.pop());
	}

	public int pop() {
		if(!queue1.isEmpty())
		return queue1.remove();
		else return 0;
	}

	
}
