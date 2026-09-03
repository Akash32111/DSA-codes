class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length,c=0;
        int minn = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minn = Math.min(minn,nums1[i]);
            if(nums1[i]%2==0){
                c++;
            }
        }
        if(minn%2!=0 || c==n){
            return true;
        }
        return false;
    }
}