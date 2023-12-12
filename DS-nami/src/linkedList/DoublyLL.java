package linkedList;

public class DoublyLL {

	private Node head;
	private int size;

	public DoublyLL() {
		super();
		this.size = 0;
	}

	public Node getNode(int index) {
		Node node = head;
		for (int i = 1; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		size++;
	}

	public void insertLast(int val) {
		Node tail = getNode(size);
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		node.prev = tail;
		node.next = null;

		if (tail != null) {
			tail.next = node;
		}

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
			System.out.println("Invalid index!");
			return;
		}

		Node p = getNode(index);
		Node node = new Node(val);
		node.next = p.next;
		p.next.prev = node;
		node.prev = p;
		p.next = node;

		size++;
	}

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		head.prev = null;
		size--;
		return val;
	}

	public int deleteLast() {
		Node tail = getNode(size);
		int val = tail.value;
		tail.prev.next = null;
		size--;
		return val;
	}

	public int delete(int index) {
		Node node = getNode(index);
		int val = node.value;
		node.prev.next = node.next;
		node.next.prev = node.prev;
		size--;
		return val;
	}

	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("END");
	}

	public void displayRev() {
		Node tail = getNode(size);
		System.out.print("Print in reverse : ");
		while (tail != null) {
			System.out.print(tail.value + " -> ");
			tail = tail.prev;
		}
		System.out.println("START");
	}

	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			super();
			this.value = value;
		}

//		public Node(int value, Node next, Node prev) {
//			super();
//			this.value = value;
//			this.next = next;
//			this.prev = prev;
//		}
	}
}
