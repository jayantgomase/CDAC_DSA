package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLL singlylist = new SinglyLL();
		
		singlylist.insertFirst(3);
		singlylist.insertFirst(4);
		singlylist.insertFirst(1);
		singlylist.insertFirst(8);
		singlylist.insertFirst(17);
		singlylist.insertLast(99);
		singlylist.insert(100, 3);

		singlylist.display();
		System.out.println(singlylist.deleteFirst());
		singlylist.display();
		System.out.println(singlylist.deleteLast());
		singlylist.display();
		System.out.println(singlylist.delete(2));
		singlylist.display();
		System.out.println(singlylist.find(65));

//		DoublyLL doublylist = new DoublyLL();
//
//		doublylist.insertFirst(8);
//		doublylist.insertFirst(13);
//		doublylist.insertFirst(2);
//		doublylist.insertFirst(10);
//		doublylist.insertFirst(17);
//		doublylist.insertFirst(5);
//
//		doublylist.insertLast(100);
//
//		doublylist.insert(999, 2);
//
//		doublylist.display();
//		doublylist.displayRev();
//
//		System.out.println(doublylist.deleteFirst());
//		System.out.println(doublylist.deleteLast());
//		System.out.println(doublylist.delete(5));
//
//		doublylist.display();
//		doublylist.displayRev();

//		CircularLL circularlist = new CircularLL();
//
//		circularlist.insert(2);
//		circularlist.insert(5);
//		circularlist.insert(17);
//		circularlist.insert(8);
//		circularlist.insert(6);
//
//		circularlist.display();
//		circularlist.insert(17, 99);
//		circularlist.insert(99, 100);
//		circularlist.display();
//		circularlist.delete(99);
//		
//		circularlist.display();
	}

}
