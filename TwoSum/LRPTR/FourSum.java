package TwoSum.LRPTR;
import java.util.*; 

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; 

        if(nums.length<4){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1; j<nums.length-2;j++){

               int left = j+1;
               int right = nums.length-1;

               while(left<right){
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
               }

            }
        }

        return new ArrayList<>(set);
    }
}
