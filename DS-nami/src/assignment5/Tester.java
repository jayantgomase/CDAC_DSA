package assignment5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			SimpleLL list = new SimpleLL();
			boolean exit = false;
			System.out.println("Integer Linked List");

			while (!exit) {
				System.out.println("1. Show contents of Linked list " + "\n2. Insert data in linked list "
						+ "\n3. Check no. of elements in linked list " + "\n4. Check if linked list is empty "
						+ "\n5. EXIT ");
				System.out.println("Enter ur choice : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					list.display();
					break;

				case 2:
					System.out.println("Enter number to insert and at what index : ");
					list.insert(sc.nextInt(), sc.nextInt());
					System.out.println("Data inserted!");
					break;

				case 3:
					System.out.println("No. of elements = " + list.getSize());
					break;

				case 4:
					System.out.println(list.isEmpty());
					break;

				case 5:
					exit = true;
					System.out.println("Bye...:)");
				}
			}
		}
	}
}
