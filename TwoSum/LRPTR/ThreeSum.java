package TwoSum.LRPTR;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        int n = nums.length;
        if(nums.length<3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();


        for(int i=0;i<n;i++){
            int left = i + 1;
            int right = n - 1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

       return new ArrayList<>(result);

        
    }
}