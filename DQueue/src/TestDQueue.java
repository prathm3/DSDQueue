
public class TestDQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DQueue dq = new DQueue();
		dq.insert(10);
		dq.insert(20);
		dq.insert(30);
		dq.insert(40);
		dq.insert(50);
		System.out.println(dq);
		dq.remove();
		dq.insert(60);
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
		dq.remove();
		System.out.println(dq);
	}

}
