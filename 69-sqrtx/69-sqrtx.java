class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int start=1;
        int end=x;
        while(start < end){
            int mid = start +(end - start)/2;
            //check if this mid is the solution
            //A little trick is using i <= x / i for comparison, instead of 
            //i * i <= x,to avoid exceeding integer upper limit
            if(mid <= x/mid && (mid+1) > x/(mid+1))
                return mid;
            //search in smaller number in left hand side
            else if(mid > x/mid){
                end=mid;  
            }else{
                //searh in rigth side
                start=mid+1;
            }
        }
        return start;
    }
}