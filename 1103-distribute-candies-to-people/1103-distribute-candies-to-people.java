class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i=0,j=0;
        while(candies>0){
            if(candies>j+1){
                ans[i] +=j+1;
                candies-=j+1;
                j++;
            }else{
                ans[i] +=candies;
                candies-=candies;
            }
            if(i==num_people-1){
                i=0;
            }else{
                i++;
            }
        }
        return ans;
    }
}