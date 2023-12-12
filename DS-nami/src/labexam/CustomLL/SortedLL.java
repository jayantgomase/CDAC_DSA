package labexam.CustomLL;

import java.util.List;

public class SortedLL {
	private Node head;
	private Node tail = getTail();
	private int size = 0;
	
	public SortedLL() {	}
	
	private void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	private void insertLast(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	private Node getTail() {
		Node temp = head;
        for (int i = 1; i <= size; i++) {
            temp = temp.next;
        }
        return temp;
	}
	
	 public void add(int val) {
	        if (size == 0 || val < head.value) {
	            insertFirst(val);
	            return;
	        }
	        
	        if (val > head.value) {
	        	
	        	if (val > tail.value) {
	        		insertLast(val);
	        		return;
	        	}
	        	Node temp = head;
		        int count = 0;
		        for (int i = 1; i < size; i++) {
		        	if(temp.value <= val) {
		        		temp = temp.next;
		        		count++;
		        	}
		        }
		        Node node = new Node(val);
	        	Node prev = getNode(count - 1);
	        	node.next = prev.next;
	        	prev.next = node;
	        	size++;
	        }
	}

	public void delete(int val) {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			if(val == temp.value) {
				Node prev = getNode(getIndex(val) - 1);
				prev.next = prev.next.next;
				size--;
			}
			temp = temp.next;
		}
	}

	 public void removeAll(List<Integer> list) {
		 for (int i = 0; i < list.size(); i++) {
			 int target = list.get(i);
			 delete(target);
		 }
	 }

	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public int find(int val) {
		int index = 0;
		Node node = head;
		while (node != null) {
			if (node.value == val) {
				return index;
			}
			node = node.next;
			index++;
		}
		return -1;
	}

	private int getIndex(int val) {
		int index = 1;
		Node temp = head;
		for (int i = 1; i < size; i++) {
			if (temp.value == val) {
				index += 1;
				return index;
			}
			temp = temp.next;
		}
		return -1;
	}
	 
	 @Override
	public String toString() {
		 Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.value + ", ");
	            temp = temp.next;
	        }
		return "END";
	}
	 
	 private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		 @Override
		 public String toString() {
			 return "Node{" +
					 "value=" + value +
					 '}';
		 }
	 }
}
