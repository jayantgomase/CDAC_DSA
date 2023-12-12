package queue;

public class QueueMain {

	public static void main(String[] args) throws Exception {
//		CustomQueue queue = new CustomQueue();
//		queue.insert(2);
//		queue.insert(5);
//		queue.insert(1);
//		queue.insert(15);
//		queue.insert(19);
//		queue.insert(6);
//		
//		queue.display();
//		
//		queue.remove();
//		queue.remove();
//		queue.display();
		
		CircularQueue cq = new CircularQueue();
		cq.insert(2);
		cq.insert(5);
		cq.insert(7);
		cq.insert(15);
		cq.insert(1);
		cq.insert(25);
		
		cq.display();
		
		System.out.println(cq.remove());
		
//		cq.insert(99);
		
		cq.display();
		

	}

}
