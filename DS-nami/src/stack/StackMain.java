package stack;

public class StackMain {

	public static void main(String[] args) throws Exception {
		CustomStack stack = new DynamicStack(5);
		stack.push(2);
		stack.push(7);
		stack.push(6);
		stack.push(19);
		stack.push(1);
		stack.push(15);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
