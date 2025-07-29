package TwoSum.LRPTR;
import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int maxSum = 0;

        while(left<=right){
            int sum = nums[left] + nums[right];
            maxSum = Math.max(sum , maxSum);
            left++;
            right--;
        }

        return maxSum;
    }
}