class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int l=0,r=0,c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                l++;
            }
            if(r==l){
                c++;
                r=0;
                l=0;
            }
        }
        return c;
    }
}