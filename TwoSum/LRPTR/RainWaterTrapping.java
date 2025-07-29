package TwoSum.LRPTR;

class Solution {
    public int trap(int[] height) {

        // Calculate LeftMax Height
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];

        for(int i=1;i<height.length;i++){
            LeftMax[i] = Math.max(LeftMax[i-1],height[i]);
        }

        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }

        int TrappedWater = 0;
        for(int i=0;i<height.length;i++){

            int WaterLevel = Math.min(LeftMax[i],RightMax[i]);
            TrappedWater += WaterLevel - height[i];
        }


        return TrappedWater;
        // Calculate RightMax Height

        // loop
        // WaterLevel = Math.min(LeftMax[i],RightMax[i]);
        // TrappedWater = WaterLevel-height;
        
    }
}