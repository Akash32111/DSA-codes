class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int num=0;
            while(n>0){
                num += n%10;
                n=n/10;
            }
            if(num==i){
                return i;
            }
        }
        return -1;
    }
}