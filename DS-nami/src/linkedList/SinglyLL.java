package linkedList;

public class SinglyLL {

	private Node head;
	private Node tail;
	private int size;

	public SinglyLL() {
		this.size = 0;
	}

	public void insertFirst(int val) { // insertion from head
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size++;
	}

	public void insertLast(int val) { // insertion from tail
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
			System.out.println("Index out of bound!");
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

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node secondLast = getNode(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}

	public int delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}

		if (index == size - 1) {
			return deleteLast();
		}

		Node prev = getNode(index - 1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		return val;
	}
	
	public boolean find(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}


	public void display() { // time complexity = O(n)
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
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
