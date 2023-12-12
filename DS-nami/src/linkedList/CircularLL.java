package linkedList;

public class CircularLL {
	private Node head;
	private Node tail;
	private int size;

	public CircularLL() {
		super();
		this.size = 0;
	}

	public void insert(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = node;
			tail = node;
			return;
		}

		tail.next = node;
		node.next = head;
		tail = node;
		size++;
	}

	public void insert(int after, int val) {
		if (after == tail.value) {
			insert(val);
			return;
		}
		
		Node n = find(after);
		if (n == null) {
			System.out.println(after + " does not exist!");
			return;
		}
		
		Node node = new Node(val);
		node.next = n.next;
		n.next = node;
		size++;
	}
	
	public Node find(int value) {
		Node node = head;
		do {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		} while (node != head);
		return null;
	}
	
	public void delete(int val) {
		Node node = head;
		if (node == null) {
			return;
		}
		
		if (node.value == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		
		Node temp = find(val);
		if (temp == null) {
			System.out.println(val + " does not exist!");
			return;
		}
		
		do {
			Node n = node.next;
			if (n.value == val) {
				node.next = n.next;
				break;
			}
			node = node.next;
		} while(node != head);
		size--;
	}

	public void display() {
		Node node = head;
		while (true) {
			System.out.print(node.value + " -> ");
			node = node.next;
			if (node.next == head) {
				System.out.print(node.value + " -> ");
				break;
			}
		}
		System.out.println("HEAD");
	}
	
	public int getSize() {
		return size;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}
	}
}
