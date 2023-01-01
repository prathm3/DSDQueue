
public class DQueue {
	int[] arr;
	static int F=-1,R=-1;
	public DQueue() {
		this.arr = new int[5];
	}
	public DQueue(int size) {
		this.arr = new int[size];
	}
	public void insert(int value) {
		if(R == arr.length-1) {
			if(F == 0) {
				System.out.print("Queue is full");
			}else if(F > 0){
				for(int i = F; i<R+1;i++) {
					arr[i-1] = arr[i];
				}
				arr[R] = value;
			}
		}else {
			if(R==-1) {
				F=R=0;
				arr[R] = value;
			}else {
				R++;
				arr[R] = value;
			}
		}
	}
	public int remove() {
		int value = 0;
		if(R==-1) {
			System.out.println("Empty Queue");
		}else {
			value = arr[F];
			F++;
		}
		return value;
	}
	public String toString() {
		String str ="";
		for(int i=F; i<R+1;i++) {
			str += arr[i] + " ";
			
		}
		str += "\n";
		return str;
	}
}
