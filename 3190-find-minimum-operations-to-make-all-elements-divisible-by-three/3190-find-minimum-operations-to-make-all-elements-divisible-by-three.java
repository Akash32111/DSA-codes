class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==2 || nums[i]%3==1){
                ans+=1;
            }
        }
        return ans;
    }
}