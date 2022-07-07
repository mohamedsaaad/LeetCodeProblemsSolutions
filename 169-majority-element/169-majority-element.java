class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for (int i: nums) {
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else{
                freq.put(i,1);
            }
        }
        
        int maxFreq=Integer.MIN_VALUE;
        int res=0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                res=entry.getKey();
            }
        }
     return res;    
    }
}