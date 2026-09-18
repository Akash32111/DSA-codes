class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(index[i]>=i){
                target[index[i]]=nums[i];
            }
            else{
                int temp = nums[i];
                for(int j=index[i];j<i;j++){
                    int curr = target[j];
                    target[j] = temp;
                    temp = curr;
                }
                target[i]=temp;
            }
        }
        return target;
    }
}