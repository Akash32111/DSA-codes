class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length,c=0;
        int []a = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            a[i]=c;
            c=0;
        }
        return a;
    }
}