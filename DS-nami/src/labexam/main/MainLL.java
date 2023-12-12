package labexam.main;

import labexam.CustomLL.SortedLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLL {

	public static void main(String[] args) {
//		SortedLL list = new SortedLL();
//		list.add(2);
//		list.add(5);
//		list.add(4);
//		list.add(9);
//		list.add(9);
//		list.add(11);
//
//		System.out.println(list.toString());
//
//		List<Integer> nums = new ArrayList<>();
//		nums.add(5);
//		nums.add(9);
//
//		list.removeAll(nums);

//		list.delete(9);
//		System.out.println(list.head.toString());

//		System.out.println(list.toString());

		boolean exit = false;
		SortedLL list = new SortedLL();

		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {
				System.out.println("1. add a element");
				System.out.println("2. remove all element");
				System.out.println("3. find a element");
				System.out.println("4. print all elements");
				System.out.println("5. EXIT\n");
				System.out.print("Enter you choice : ");
				int choice = sc.nextInt();
				switch (choice) {

					case 1:
						System.out.print("Enter the number : ");
						int num = sc.nextInt();
						list.add(num);
						System.out.println("element added...\n");
						break;

					case 2:
						System.out.println("Enter list of elements to remove : ");
						List<Integer> ll = new ArrayList<Integer>();
						boolean done = false;
						while (!done) {
							System.out.println("Enter element to remove : ");
							ll.add(sc.nextInt());
							System.out.print("Done? true/false : ");
							boolean ans = sc.nextBoolean();

							if (ans) {
								done = true;
							} else {
								continue;
							}
						}
						list.removeAll(ll);
						System.out.println("elements removed...\n");
						break;

					case 3:
						System.out.print("Enter the element to find : ");
						int target = sc.nextInt();

						if (list.find(target) == -1) {
							System.out.println(list.find(target) + "\n");
						} else {
							System.out.println("element at index " + list.find(target) + "\n");
						}

						break;

					case 4:
						System.out.println(list.toString() + "\n");
						;
						break;

					case 5:
						exit = true;
						System.out.println("bye..");
						break;

					default:
						System.out.println("invalid input...try again..\n");
				}
			}
		}
	}
}
