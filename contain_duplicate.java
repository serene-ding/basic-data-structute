import java.util.Arrays;

class contain_duplicate{
     public static boolean contain_duplicate(int[] nums){
     	Arrays.sort(nums);
     	int length = nums.length;
     	for (int i = 0; i < length - 1; i++){
     		if (nums[i] == nums[i+1]){
     			return true;
     		}
     	}
          return false;
     }


     public static void main(String[] args){
          int[] test1 = {2,3,4,1};
          int[] test2 = {2,7,5,1};
          int[] test3 = {3,4,5,3,1};
          contain_duplicate(test1);
          contain_duplicate(test2);
          contain_duplicate(test3);
     }
}