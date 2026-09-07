class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = r*c-1;
        while(left <=right){
            int m = left +(right-left)/2;
            int row =m/c;
            int col =m%c;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                right = m-1;
            }
            else{
                left = m+1;
            }
        }
        return false;
    }
}