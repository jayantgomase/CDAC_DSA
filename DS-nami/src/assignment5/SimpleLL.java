package assignment5;

public class SimpleLL {
	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insert(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		if (index > size) {
			System.out.println("Invalid Index!");
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;

		size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
	}
}
