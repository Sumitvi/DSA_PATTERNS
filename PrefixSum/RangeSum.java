class NumArray {

    private int []prefix;
    public NumArray(int[] nums) {
         prefix = new int[nums.length + 1];
        for(int i=1;i<=nums.length;i++){
            prefix[i+1] = nums[i]+ prefix[i];
        }
        
    }
    
    public int sumRange(int left, int right) {

        return prefix[right+1] - prefix[left];
       
        
    }
}