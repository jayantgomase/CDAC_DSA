package stack;

import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) throws Exception {
		CustomStack stack = new CustomStack(5);
		stack.push(2);
		stack.push(7);
		stack.push(6);
		stack.push(19);
		stack.push(1);
		
		stack.display();
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
