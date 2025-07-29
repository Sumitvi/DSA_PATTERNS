package TwoSum.LRPTR;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Arrays.sort(nums);

        int left = 0 , right = nums.length-1;

        while(left<right){

            int sum = nums[left] + nums[right];

            if(sum==target){
                int a[] = {left , right};
                return a;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return null;
      
        
    }
}
