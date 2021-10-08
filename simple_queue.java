class simple_queue{
	private List<Integer> data;
	private int p_start;
	public simple_queue(){
		data = new ArrayList<Integer>();
		p_start = 0;
	}
	public boolean enqueue(int i){
		data.add(i);
		return true;
	}
	public boolean dequeue(){
		if (is_empty == true){
			return false;
		}
		p_start++;
		return true;
	}
	public int front(){
		return data.get(p_start);
	}
	public boolean is_empty(){
		return p_start >= data.size();  //为什么要大于？？？
	}



	
}