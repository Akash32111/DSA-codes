class Solution {
public:
    int strStr(string haystack, string needle) {
        int a =haystack.find(needle);
        int n = haystack.length();
        if(a>=0 && a<n){
            return a;
        }
        return -1;
    }
};