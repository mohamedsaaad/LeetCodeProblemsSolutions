class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
        boolean res=false;
        int start=1;
        int end=num;
        while (end > start){
           float mid=start+(end-start)/2;
            //check if this the solution or not
            if((float)num/mid == mid){
                    return true;
            }else if(mid > num/mid){
                end=(int)mid;
            }else{
                start=(int)mid+1;
            }
        } 
        return res;
    }
}