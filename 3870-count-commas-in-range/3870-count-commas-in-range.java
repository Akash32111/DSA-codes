class Solution {
    public int countCommas(int n) {
        int digit = String.valueOf(n).length();
        if(digit<4){
            return 0;
        }
        return n-999;
    }
}