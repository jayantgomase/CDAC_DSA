package tree;

import java.util.Scanner;

public class BinaryTree {
	public BinaryTree() { }
	
	public static class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	
	private Node root;
	
	public void populate(Scanner sc) {
		System.out.print("Enter root node : ");
		int value = sc.nextInt();
		root = new Node(value);
		populate(sc, root);
	}

	private void populate(Scanner sc, Node node) {
		System.out.print("want to enter left of " + node.value + "?");
		boolean left = sc.nextBoolean();
		if(left) {
			System.out.print("enter the value left of " + node.value + " : ");
			int value = sc.nextInt();
			node.left = new Node(value);
			populate(sc, node.left);
		}
		
		System.out.print("want to enter right of " + node.value + "?");
		boolean right = sc.nextBoolean();
		if(right) {
			System.out.print("enter the value right of " + node.value + " : ");
			int value = sc.nextInt();
			node.right = new Node(value);
			populate(sc, node.right);
		}
	}
	
	public void display() {
		display(root, "");
	}

	private void display(Node node, String indent) {
		if (node == null) {
			return;
		}
		System.out.println(indent + node.value);
		display(node.left, indent + "\t");
		display(node.right, indent + "\t");
	}
	
	public void prettyDisplay() {
		prettyDisplay(root, 0);
	}

	private void prettyDisplay(Node node, int level) {
		if (node == null) {
			return;
		}
		
		prettyDisplay(node.right, level + 1);
		
		if (level != 0) {
			for(int i = 0; i < level - 1; i++) {
				System.out.print("|\t\t");
			}
			System.out.println("|------>" + node.value);
		} else {
			System.out.println(node.value);
		}
		prettyDisplay(node.left, level + 1);
	}
}
