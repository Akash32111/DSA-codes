class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,o=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                p*=nums[i];
            }
            else{
                o++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0 && o==1){
                ans[j]=p;
            }
            else if(o==0){
                ans[j]=p/nums[j];
            }
            else{
                ans[j]=0;
            }
        }
        return ans;
    }
}