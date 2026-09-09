class Solution {
    public long countCommas(long n) {
        int digit = String.valueOf(n).length();
        long ans=0;
        if(digit>=4 && digit<=6){
            ans = n-999;
        }
        else if(digit>=7 && digit<=9){
            ans = (n-999999) + (n-999);
        }
        else if(digit>=10 && digit<=12){
            ans = (n-999999999) + (n-999999) + (n-999);
        }
        else if(digit>=13 && digit<=15){
            ans = (n-999999999999L) + (n-999999999) + (n-999999) + (n-999);
        }
        else if(digit==16){
            ans = (n-999999999999L) + (n-999999999) + (n-999999) + (n-999);
            ans+=1;
        }
        return ans;
    }
}