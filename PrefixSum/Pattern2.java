import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

    //  HashMap + prefix Sum Approach -- Optimized Version
    HashMap<Integer , Integer> map = new HashMap<>();
    map.put(0,1);
    int count = 0 , sum = 0;

    for(int num : nums){
        sum+=num;
        if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }

        map.put(sum , map.getOrDefault(sum , 0) + 1);
    }

    return count;

    }
}