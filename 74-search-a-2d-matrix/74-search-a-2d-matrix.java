class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int start=0;
       int topRight=matrix[0].length-1;
       while(start < matrix.length &&  topRight >= 0){
            if(matrix[start][topRight]==target)
                return true;
            else if(matrix[start][topRight] > target){
                topRight--;
            }else {
                start++;
            }
       }
       return false;
    }
}