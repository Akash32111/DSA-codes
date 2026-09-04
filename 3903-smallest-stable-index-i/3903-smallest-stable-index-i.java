class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int a=0,ind=0;
        for (int i = 0; i < n; i++) {
            int max = Arrays.stream(nums,0,i+1).max().getAsInt();
            int min = Arrays.stream(nums,i,n).min().getAsInt();
            a = max - min;
            if(a <= k){
               return i; 
            }
        }
        return -1;
    }
}