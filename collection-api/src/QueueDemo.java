import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		que.offer("Yash");
		que.offer("Harshita");
		
		System.out.println(que.peek());
		System.out.println(que.remove());
		System.out.println(que.peek());
	}

}
