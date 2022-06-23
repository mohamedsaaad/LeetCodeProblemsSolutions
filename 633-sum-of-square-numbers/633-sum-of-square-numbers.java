class Solution {
    public boolean judgeSquareSum(int c) {
        long  start=0;
        long end=(int)Math.sqrt(c);
        while(start <= end){
            long cur=(start*start) + (end*end);
            if(cur == c) return true;
            if(cur < c) {
                start++;
            } else{
                end--;
            }
        }
        return false;
    }
}