class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []result=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length ; i++) {
         int first=nums[i];
         if(map.containsKey(target-first)&& i != map.get(target-first)){
             int second=map.get(target-first);
             result[0]=i;
             result[1]=second;
             return result;
         }
        }
        return result;
        
    }
}