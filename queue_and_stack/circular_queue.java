public class circular_queue{

	private int[] data;
	private int head;
	private int tail;
	private int size;
	
	public circular_queue(int s){
		data = new int[s];
		head = -1;
		tail = -1;
		size = s;
	}

	public boolean enqueue(int d){
		if (is_full()){
			return false;
		};
		if (is_empty()){
			head = 0;
			tail = 0;
			data[tail] = d;
			return true;
		};
		tail = (tail+1) % size;
		data[tail] = d;
		return true;
	}

	public boolean dequeue(){
		if(is_empty()){
			return false;
		};
		if(head == tail){
			head = -1;
			tail = -1;
			return true;
		};
		head = (head + 1)%size;
		return true;
	}

	public int front(){
		if(is_empty()){
			return -1;
		};
		return data[head];
	}

	public int rear(){
		if(is_empty()){
			return -1;
		};
		return data[tail];
	}

	public boolean is_full(){
		return (tail+1)%size == head;
	}

	public boolean is_empty(){
		return head == -1;
	}

	public static void main(String[] args){ //at this moment 我都不知道咋调用class，现在知道了。
		circular_queue queue1 = new circular_queue(7);
		queue1.enqueue(8);
		queue1.enqueue(10);
		queue1.enqueue(15);
		System.out.println(queue1.front());
		System.out.println(queue1.rear());
		
		queue1.dequeue();
		System.out.println(queue1.front());
		System.out.println(queue1.rear());



	}

}