class Solution {
    public int removeDuplicates(int[] nums) {
        int result=(nums==null || nums.length==0)?0:1;
        int current=nums[0];
        int position=1;
        for (int i = 1; i <nums.length ; i++) {
            if(current != nums[i]){
                nums[position]=nums[i];
                current=nums[i];
                position++;
                result++;
            }
        }
        return result;   
    }
}