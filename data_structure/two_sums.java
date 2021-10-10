import java.util.*; ;

class two_sums{
	public static void two_sums(int[] nums,int target){
		Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
		int n = nums.length;
		for (int i = 0; i < n;i++){
			if (hashtable.containsKey(target-nums[i])){
				int[] ans = {hashtable.get(target-nums[i]),i};
				System.out.print(Arrays.toString(ans));
			}
			hashtable.put(nums[i],i);
		}
		
	}

	public static void main(String args[]){
		int[] nums1 = {2,7,6,8};
		int target1 = 9;
		int[] nums2 = {1,2,4,6,3};
		int target2 = 6;
		two_sums(nums1,target1);
		two_sums(nums2,target2);
	}
}