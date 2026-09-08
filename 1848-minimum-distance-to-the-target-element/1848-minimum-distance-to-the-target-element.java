class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length,min=n;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(Math.abs(i-start)<min){
                    min = Math.abs(i-start);
                }
            }
        }
        return min;
    }
}