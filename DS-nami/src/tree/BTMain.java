package tree;

import java.util.Arrays;
import java.util.Scanner;

public class BTMain {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		BinaryTree bt = new BinaryTree();
//		bt.populate(sc);
//		bt.prettyDisplay();
		
		BinarySearchTree bst = new BinarySearchTree();	
		int[] nums = {15, 14, 4, 18, 12, 7, 9, 13, 16, 20};
//		bst.populate(nums);
//		bst.display();
//		bst.prettyDisplay();
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		bst.populateSorted(nums);
		bst.display();
		bst.prettyDisplay();
	}
	
	
}
