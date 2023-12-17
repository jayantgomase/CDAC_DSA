package stack;

import java.util.Arrays;

public class CustomStack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int top = -1;
	
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	
	public CustomStack(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full!!");
		}
		top++;
		data[top] = item;
		return true;
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty!!!");
		}
		int removed = data[top];
		top--;
		return removed;
	}
	
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty!!!");
		}
		return data[top];
	}

	public boolean isFull() {
		return top == data.length - 1; 
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty!!!");
		}
		System.out.println(Arrays.toString(data));
	}
}
