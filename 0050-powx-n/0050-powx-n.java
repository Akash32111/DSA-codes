class Solution {
    public double myPow(double x, int n) {
        long n1 =Math.abs((long)n);
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        double ans=1;
        while(n1>0){
            if(n1%2==1){
                ans*=x;
            }
            x*=x;
            n1=n1/2;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}