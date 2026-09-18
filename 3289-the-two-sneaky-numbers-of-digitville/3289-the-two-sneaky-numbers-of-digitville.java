class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        a.sort(null);
        ArrayList<Integer> an = new ArrayList<>();
        int[] ans = new int[2];
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)==a.get(i+1)){
                an.add(a.get(i));
            }
        }
        for(int i=0;i<an.size();i++){
            ans[i]=an.get(i);
        }
        return ans;
    }
}