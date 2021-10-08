
class maxSubarray{
	public static void maxSubarray(int[] nums){
		int answer = nums[0];//这个地方不太懂
		int fi = 0;
		for (int x : nums){
		fi = Math.max(fi + x, x);
	    answer = Math.max(fi,answer);
	    }
	    System.out.println(answer); 
	}
	      
	public static void main(String[] args){
	    int[] test1 = {-2,1,-3,4,-1,2,1,-5,4};
	    int[] test2 = {-1};
		maxSubarray(test1);
		maxSubarray(test2);


	}     
}

 