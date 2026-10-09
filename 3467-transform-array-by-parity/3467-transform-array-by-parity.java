class Solution {
    public int[] transformArray(int[] nums) {
        int e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                e++;
            }
        }
        for(int i=0;i<e;i++){
            nums[i]=0;
        }
        for(int j=e;j<nums.length;j++){
            nums[j]=1;
        }
        return nums;
    }
}