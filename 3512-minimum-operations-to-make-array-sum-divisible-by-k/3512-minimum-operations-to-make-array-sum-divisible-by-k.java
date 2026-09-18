class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k == 0) {
            return 0;
        } else {
            while (sum > 0) {
                sum--;
                c++;
                if (sum % k == 0) {
                    return c;
                }
            }
        }
        return 0;
    }
}