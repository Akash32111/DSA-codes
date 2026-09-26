class Solution {
public:
    void reverseString(vector<char>& s) {
        int n=s.size();
        int f=0,e=n-1;
        while(f<e){
            swap(s[f++],s[e--]);
        }
    }
};